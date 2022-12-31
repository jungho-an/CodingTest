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
        int V, E, begin;
        int [] resArr;
        boolean [] isArrived;
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        isArrived = new boolean[V];
        resArr = new int[V];

        st = new StringTokenizer(br.readLine());
        begin = Integer.parseInt(st.nextToken()) - 1;

        for(int i=0; i<V; i++) {
            graph.add(new ArrayList<Node>());
        }

        for(int i=0; i<E; i++) {
            int u, v, w;

            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            graph.get(u - 1).add(new Node(v - 1, w));
        }

        Arrays.fill(resArr, -1);
        resArr[begin] = 0;

        while(true) {
            for(Node node: graph.get(begin)) {
                if(resArr[node.getIdx()] == -1) {
                    resArr[node.getIdx()] = resArr[begin] + node.getCost();
                }else {
                    if(resArr[node.getIdx()] > resArr[begin] + node.getCost()) {    //기존 경로보다 현재 경로가 짧을 때
                        resArr[node.getIdx()] = resArr[begin] + node.getCost();
                    }
                }

            }
            isArrived[begin] = true;

            int nextStartNode = -1;
            for(int i=0; i<V; i++) {
                if(!isArrived[i] && resArr[i] != -1 && nextStartNode == -1) {
                    nextStartNode = i;
                }else {
                    if(!isArrived[i] && resArr[i] != -1 && resArr[nextStartNode] > resArr[i]) {
                        nextStartNode = i;
                    }
                }
            }

            begin = nextStartNode;

            if(nextStartNode == -1) {
                break;
            }
        }

        for(int i=0; i<V; i++) {
            if(resArr[i] != -1) {
                bw.write(Integer.toString(resArr[i]));
                bw.newLine();
            }else {
                bw.write("INF");
                bw.newLine();
            }
        }


        bw.flush();
        bw.close();
    }


}