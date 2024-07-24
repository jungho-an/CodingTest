package com.completed;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	double A;					//낮에 올라갈 수 있는 높이
    	double B;					//밤에 미끄러지는 높이
    	double V;					//막대기 끝의 높이
    	//int currentHeight = 0;	//현재 달팽이의 위치
    	double date = 0;			//경과된 날짜
    	
    	st = new StringTokenizer(br.readLine());
    	
    	A = Double.parseDouble(st.nextToken());
    	B = Double.parseDouble(st.nextToken());
    	V = Double.parseDouble(st.nextToken());
    	
//    	while(true) {
//    		date++;
//    		//낮에 꼬물꼬물..
//    		currentHeight = currentHeight + A;
//    		//낮에 막대기의 끝에 도달
//    		if(currentHeight >= V) {
//    			break;
//    		}
//    		//밤에 미끄덩..
//    		currentHeight = currentHeight - B;
//    	}
    	//시간초과 났네..
    	
    	//(A - B) 하루의 끝에 올라간 총 높이
    	//(A - B) * 등반 전날 + A >= V 니까
    	//등반 전날 >= V - A /(A - B)인 최소 자연수
    	//ex) 등반 전날 >= 5 - 2 / (2 - 1)  	==> 등반 전날은 3일
    	//ex) 등반 전날 >= 6 - 5 / (5 - 1)		==> 등반 전날은 1일	  
    	//ex) 등반 전날 >= 1000000000 - 100 / (100 - 99) ==> 등반 전날은 999999900
    	date = Math.ceil((V - A) /(A - B));
    	date += 1;
    	
    	
    	//막대기 끝에 도달한 날짜 출력
    	bw.write(String.format("%.0f",date));
    	bw.flush();
    	
    	br.close();
    	bw.close();
    	
    }
}