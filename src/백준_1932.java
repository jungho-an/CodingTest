import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 백준_1932 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n, tmpCnt = 1;
        int [] nArr;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        nArr = new int [((n + 1) * n / 2) + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i; j++) {
                nArr[tmpCnt] = Integer.parseInt(st.nextToken());
                tmpCnt++;
            }
        }
        ////
        int a, b, lNum, rNum;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                lNum = (i + 1) * i / 2 - j;
                rNum = (i + 1) * i / 2 - j - 1;

                b = nArr[lNum];
                a = nArr[rNum];

                if(a > b) {
                    nArr[(i * (i - 1) / 2) - j] += a;
                }else {
                    nArr[(i * (i - 1) / 2) - j] += b;
                }
            }
        }
        bw.write(Integer.toString(nArr[1]));
        bw.flush();
        bw.close();
    }
}
