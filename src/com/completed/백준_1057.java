package com.completed;
import java.io.*;
import java.util.Iterator;
import java.util.StringTokenizer;

public class 백준_1057 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N;
    	int kim;
    	int im;
    	int rst = 0;
    	
    	st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	kim = Integer.parseInt(st.nextToken());
    	im = Integer.parseInt(st.nextToken());
    	
    	while(kim != im) {
    		rst++;
    		
    		if(kim % 2 == 1) {	//김지민이 홀수 번호
    			kim = (kim + 1) / 2;
    		}else {
    			kim = kim / 2;
    		}
    		
    		if(im % 2 == 1) {	//임한수가 홀수 번호
    			im = (im + 1) / 2;
    		}else {
    			im = im / 2;
    		}
    	}
    	
    	bw.write(Integer.toString(rst));
    	bw.flush();
    	
    	br.close();
    	bw.close();
    }
}