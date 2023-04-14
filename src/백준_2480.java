import java.io.*;
import java.util.StringTokenizer;

public class 백준_2480 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int rst;
        int [] numArr = new int[3];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        if(numArr[0] == numArr[1] && numArr[0] == numArr[2] && numArr[1] == numArr[2]) {
            rst = 10000 + numArr[0] * 1000;
        }else if(numArr[0] == numArr[1]) {
            rst = 1000 + numArr[0] * 100;
        }else if(numArr[0] == numArr[2]) {
            rst = 1000 + numArr[0] * 100;
        }else if(numArr[1] == numArr[2]) {
            rst = 1000 + numArr[1] * 100;
        }else {
            if(numArr[0] > numArr[1]) {
                if(numArr[0] > numArr[2]) {
                    rst = numArr[0] * 100;
                }else {
                    rst = numArr[2] * 100;
                }
            }else {
                if(numArr[1] > numArr[2]) {
                    rst = numArr[1] * 100;
                }else {
                    rst = numArr[2] * 100;
                }
            }
        }
        bw.write(Integer.toString(rst));
        bw.flush();
        bw.close();
    }
}
