import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 백준_1238 {
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
        int N, M, X;
        int [] tArr, resArr;
        boolean [] isConfirmed;

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        List<Integer> resList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        tArr = new int[N];
        resArr = new int[N];

        for(int i=0; i<N; i++) {
            graph.add(new ArrayList<Node>());
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());

            graph.get(A - 1).add(new Node(B - 1, T));
        }

        //////////

        for (int i = 0; i < N; i++) {
            int begin = i;
            Arrays.fill(tArr, -1);
            isConfirmed = new boolean[N];
            tArr[begin] = 0;

            while(true) {
                for(Node node : graph.get(begin)) {     //begin에 인접한 마을 중
                    if(!isConfirmed[node.idx]) {          //아직 최단경로가 확정이 안된 마을
                        if(tArr[node.idx] == -1) {                          //처음 경로 등록 시
                            tArr[node.idx] = tArr[begin] + node.cost;
                        }else {
                            if(tArr[node.idx] > tArr[begin] + node.cost)    //기존 경로보다 더 짧은 경로 발견 시
                                tArr[node.idx] = tArr[begin] + node.cost;
                        }
                    }
                }
                isConfirmed[begin] = true;

                int nextNode = -1;              //다음 시작할 마을
                for(int j=0; j<N; j++) {
                    if(!isConfirmed[j]) {       //확정 안된 마을 중
                        if(tArr[j] != -1 && nextNode == -1) {    //첫빠따는 기준으로 사용하기 위해 강 넣어
                            nextNode = j;
                        }else {
                            if(tArr[j] != -1 && tArr[nextNode] > tArr[j]) {
                                nextNode = j;
                            }
                        }
                    }
                }
                begin = nextNode;
                
                if(nextNode == -1) {        //모든 마을의 최단경로가 확정되었을 때

                    break;
                }
            }

            if(i != X - 1) {            //처음 기준점 마을(i)이 목적지(X)가 아닌 경우
                resArr[i] += tArr[X - 1];   //i -> X로 가는 최단 경로를 넣어라
            }else {                     //처음 기준점 마을(i)가 목적지 마을(X)일 경우
                for(int j=0; j<N; j++) {
                    resArr[j] += tArr[j];
                }
            }
        }

        int res = 0;
        for (int tmp : resArr) {
            if(res < tmp) {
                res = tmp;
            }
        }

        bw.write(Integer.toString(res));
//        bw.write(Arrays.toString(resArr));

        bw.flush();
        bw.close();
    }


}