import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        int N, M, X;
        int [] tArr;

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        List<Integer> resList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        tArr = new int[N];

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

        int begin = 0;
        while(true) {
            Arrays.fill(tArr, -1);
            for(Node node : graph.get(begin)) {

            }

        }


//        bw.flush();
//        bw.close();
    }


}