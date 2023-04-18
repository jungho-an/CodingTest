import java.io.*;
import java.util.StringTokenizer;

public class 백준_1149 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int N, ans;
        int rst1 = 0, rst2 = 0, rst3 = 0;   //마지막에 총 더한 값
        int [][] colorArr;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        colorArr = new int[N + 1][3];   //colorArr[0][]은 계산상 편의를 위해 빈칸으로 놔둠
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                colorArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ////
        int tmpRst1 = 0;
        int tmpRst2 = 0;
        int tmpRst3 = 0;

        rst1 += colorArr[1][0];
        rst2 += colorArr[1][1];
        rst3 += colorArr[1][2];

        for (int i = 2; i <= N; i++) {
            //rst1 값 갱신
            if(rst2 <= rst3) {
                tmpRst1 = colorArr[i][0] + rst2;
            }else {
                tmpRst1 = colorArr[i][0] + rst3;
            }
            //rst2 값 갱신
            if(rst1 <= rst3) {
                tmpRst2 = colorArr[i][1] + rst1;
            }else {
                tmpRst2 = colorArr[i][1] + rst3;
            }
            //rst3 값 갱신
            if(rst1 <= rst2) {
                tmpRst3 = colorArr[i][2] + rst1;
            }else {
                tmpRst3 = colorArr[i][2] + rst2;
            }
            rst1 = tmpRst1;
            rst2 = tmpRst2;
            rst3 = tmpRst3;
        }
        if(rst1 <= rst2) {
            if(rst1 <= rst3) {
                ans = rst1;
            }else {
                ans = rst3;
            }
        }else {
            if(rst2 <= rst3) {
                ans = rst2;
            }else {
                ans = rst3;
            }
        }
        bw.write(Integer.toString(ans));
        bw.flush();
        bw.close();
    }
}
