package com.completed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_32516 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int N;
    	String S;
    	int K = 0;
    	
    	//N, S 초기화
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	st = new StringTokenizer(br.readLine());
    	S = st.nextToken();
    	
    	////for 1 ~ N/2이 N ~ (N/2반올림 + 1) 이 
    	//////둘 다 ? 면 K + 26
    	//////하나만 ? 면 K + 1
    	//////둘다 ?가 아니고 문자가 같으면 continue
    	//////둘다 ?가 아니고 문자가 다르면 K = 0하고 K 반환
    	
    	int cnt = (int) N / 2;	//시행횟수
    	
    	for (int i = 0; i < cnt; i++) {
    		//비교할 문자 초기화
    		char front = S.charAt(i);
    		char back = S.charAt(N - 1 - i);
    		
    		if (front == '?' && back == '?') {
    			K += 26;
    		}else if (front == '?' || back == '?') {
    			K += 1;
    		}else if (front == back) {
    			continue;
    		}else {
    			K = 0;
    			break;
    		}
		}
    	
    	bw.write(Integer.toString(K));
    	bw.flush();
    	
    	br.close();
    	bw.close();
    }
}
