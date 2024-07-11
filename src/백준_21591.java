import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class 백준_21591 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int laptopWidth;
    	int laptopHeight;
    	int stickerWidth;
    	int stickerHeight;
    	
    	st = new StringTokenizer(br.readLine());
    	laptopWidth = Integer.parseInt(st.nextToken());
    	laptopHeight = Integer.parseInt(st.nextToken());
    	stickerWidth = Integer.parseInt(st.nextToken());
    	stickerHeight = Integer.parseInt(st.nextToken());
    	
    	if((laptopWidth >= stickerWidth + 2) &&
    			(laptopHeight >= stickerHeight + 2)) {
    		bw.write("1");
    	}else {
    		bw.write("0");
    	}
    	
    	bw.flush();
    	
    	br.close();
    	bw.close();
    }
}