package com.completed;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_10813 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
		int N;
		int M;
		int tmp;
		int[] basket;
		
		st = new StringTokenizer(br.readLine());		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		//초기화
		basket = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			basket[i] = i;
		}
		
		//체체체 체인지
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int chgBasketNum1 = Integer.parseInt(st.nextToken());
			int chgBasketNum2 = Integer.parseInt(st.nextToken());
			
			tmp = basket[chgBasketNum1];
			basket[chgBasketNum1] = basket[chgBasketNum2];
			basket[chgBasketNum2] = tmp;
		}
		
		for (int i = 1; i < basket.length; i++) {
			bw.write(basket[i] + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();		
    }
}
