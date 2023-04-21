import java.io.*;
import java.util.StringTokenizer;

public class 백준_25304 {


    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int X, N, rst = 0;
        int [] aArr, bArr;
        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        aArr = new int[N];
        bArr = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            aArr[i] = Integer.parseInt(st.nextToken());
            bArr[i] = Integer.parseInt(st.nextToken());
        }
        ////
        for (int i = 0; i < N; i++) {
            rst += aArr[i] * bArr[i];
        }
        if(X == rst) {
            bw.write("Yes");
        }else {
            bw.write("No");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
