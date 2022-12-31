import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static class Node {
        private int idx;
        private int cost;

        public Node(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }

        public int getIdx() {
            return idx;
        }

        public void setIdx(int idx) {
            this.idx = idx;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        int n, m, r, result = 0;
        int [] tArr;
        int [] minDistArr, numTotalItemArr;  //최단거리, 총 아이템 갯수
        boolean [] isArrived;               //노드에 왔었는지 확인
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        tArr = new int[n];
        for(int i=0; i<n; i++) {   //0 ~ N-1까지 N개의 ArrayList 생성
            graph.add(new ArrayList<Node>());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {   //tArr[1] ~ tArr[n] 초기화
            tArr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<r; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            graph.get(a-1).add(new Node(b-1, l));
            graph.get(b-1).add(new Node(a-1, l));
        }

        ///////////////

        for(int i=0; i<n; i++) {
            int start = i;
            minDistArr = new int[n];
            isArrived = new boolean[n];

            Arrays.fill(minDistArr, 999999);
            minDistArr[i] = 0;

            while(true) {
                for(Node node : graph.get(start)) {
                    if(!isArrived[node.getIdx()]) {
                        if(minDistArr[node.getIdx()] > minDistArr[start] + node.getCost() ) {
                            minDistArr[node.getIdx()] = minDistArr[start] + node.getCost();     //간선의 비용
                        }
                    }
                }
                
                isArrived[start] = true;
                int nextStartNode = 999;   //다음에 갈 곳

                for(int j=0; j<n; j++) {
                    if(!isArrived[j]) {
                        if(nextStartNode == 999) {
                            nextStartNode = j;
                        }
                        if(minDistArr[nextStartNode] > minDistArr[j]) {
                            nextStartNode = j;
                        }
                    }
                }
                start = nextStartNode;
                if(nextStartNode == 999) {   //모든 노드 탐방 완료
                    break;
                }
            }
            int currentTempResult = 0;
            for(int j=0; j<n; j++) {
                if(minDistArr[j] <= m) {    //갈 수 있는 m 내에서 가장 큰 값을 result 저장
                    currentTempResult += tArr[j];
                }
            }

            if(result < currentTempResult) {
                result = currentTempResult;
            }


        }
        bw.write(Integer.toString(result));

        bw.flush();
        bw.close();
    }


}