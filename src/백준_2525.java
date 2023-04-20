import java.io.*;
import java.util.StringTokenizer;

public class 백준_2525 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int A, B, C;
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        ////
        B += C;
        while(B >= 60) {
            B -= 60;
            A++;
        }
        while(A >= 24) {
            A -= 24;
        }
        bw.write(Integer.toString(A) + " " + Integer.toString(B));
        bw.flush();
        bw.close();
    }
}
