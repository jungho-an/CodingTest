package com.completed;
import java.io.*;
import java.util.StringTokenizer;

public class 백준_5523 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N;
    	int[] A;
    	int[] B;
    	int aWinNum = 0;
    	int bWinNum = 0;
    	
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	A = new int[N];
    	B = new int[N];
    	
    	for (int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		A[i] = Integer.parseInt(st.nextToken());
    		B[i] = Integer.parseInt(st.nextToken());
		}
    	
    	
    	for (int i = 0; i < N; i++) {
    		if(A[i] > B[i]) {
    			aWinNum++;
    		}else if(A[i] < B[i]) {
    			bWinNum++;
    		}
		}
    	
    	bw.write(aWinNum + " " + bWinNum);
    	
    	bw.flush();
    	
    	br.close();
    	bw.close();
    	
    }
}