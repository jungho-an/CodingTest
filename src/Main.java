import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int kingCntRequired = 1 - Integer.parseInt(st.nextToken());
        int queenCntRequired = 1 - Integer.parseInt(st.nextToken());
        int rookCntRequired = 2 - Integer.parseInt(st.nextToken());
        int bishopCntRequired = 2 - Integer.parseInt(st.nextToken());
        int knightCntRequired = 2 - Integer.parseInt(st.nextToken());
        int pawnCntRequired = 8 - Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(kingCntRequired) + " "
                + String.valueOf(queenCntRequired) + " "
                + String.valueOf(rookCntRequired) + " "
                + String.valueOf(bishopCntRequired) + " "
                + String.valueOf(knightCntRequired) + " "
                + String.valueOf(pawnCntRequired));

        bw.flush();
        bw.close();
    }
}