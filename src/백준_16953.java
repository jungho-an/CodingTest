import java.io.*;
import java.util.*;

public class 백준_16953 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static class Node {
        int chgCnt;
        double num;

        public Node(int chgCnt, double num) {
            this.chgCnt = chgCnt;
            this.num = num;
        }
    }

    public static void main(String[] args) throws IOException {
        int A, B, ans = -1;
        double tmp;
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        ////
        Deque<Node> queue = new ArrayDeque<>();
        queue.addFirst(new Node(1, A));

        Node now;
        while(queue.peekLast() != null) {
            now = queue.pollLast();
            if(now.num == B) {
                ans = now.chgCnt;
            }
            if(now.num >= B) {  //B보다 큰 수일 경우 삭제
                continue;
            }

            tmp = now.num * 2;
            if(tmp > B) {
                continue;
            }else {
                queue.addFirst(new Node(now.chgCnt + 1, tmp));
            }

            tmp = now.num * 10 + 1;
            if(tmp > B) {
                continue;
            }else {
                queue.addFirst(new Node(now.chgCnt + 1, tmp));
            }
        }
        bw.write(Integer.toString(ans));
        bw.flush();
        bw.close();
    }
}
