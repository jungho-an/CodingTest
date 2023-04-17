import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 백준_11053 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int N, rst = 1;
        int [] A, rstArr;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        ////
        rstArr = new int[N];
        rstArr[0] = 1;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if(A[j] < A[i] && rstArr[j] > rstArr[i]) {
                    rstArr[i] = rstArr[j];
                }
            }
            rstArr[i]++;
            if(rstArr[i] >= rst) {
                rst = rstArr[i];
            }

        }
        bw.write(Integer.toString(rst));
        bw.flush();
        bw.close();
    }
}
