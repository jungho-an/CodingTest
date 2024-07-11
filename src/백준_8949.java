import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 백준_8949 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	String A;
    	String B;
    	String rst = "";
    	
    	st = new StringTokenizer(br.readLine());
    	A = st.nextToken();
    	B = st.nextToken();
    	
    	int lengthA = A.length();
    	int lengthB = B.length();
    	
    	if(A.length() <= 7) {
    		for (int i = 0; i < (7 - lengthA); i++) {
				A = "0" + A;
			}
    	}
    	if(B.length() <= 7) {
    		for (int i = 0; i < (7 - lengthB); i++) {
				B = "0" + B;
			}
    	}
    	
    	for (int i = 0; i < 7; i++) {
    		int intTmpA = (int)A.charAt(i) - '0';
    		int intTmpB = (int)B.charAt(i) - '0';
    		String tmpStr = Integer.toString(intTmpA + intTmpB);
			rst = rst + tmpStr;
		}
    	
    	bw.write(Long.toString(Long.parseLong(rst)));
    	
    	bw.flush();
    	
    	br.close();
    	bw.close();
    	
    }
}