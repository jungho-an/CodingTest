import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N, res = 0, comp = 1;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        while(true) {
            if(N <= comp) {
                break;
            }
            res += 1;
            comp += 6 * res;
        }
        bw.write(Integer.toString(res + 1));

        bw.flush();
        bw.close();
    }


}