package com.completed;
import java.io.*;
import java.util.StringTokenizer;

public class 백준_10989 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	long startTime = System.currentTimeMillis();
    	
    	int N;
    	int cntArr[];
    	int tmp = 0;
    	
    	st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	
    	//cntArr[1] ~ cntArr[N]배열에 수의 갯수 받음 (cntArr[0]은 헷갈리니 제외)
    	//cntArr = new int[N + 1];	//이게 아니라 ( ArrayIndexOutOfBounds 에러발생.. )
    	cntArr = new int[10001];	//수가 1 ~ 10,000이므로 이렇게 해야 함
    	
    	for (int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		tmp = Integer.parseInt(st.nextToken());
    		cntArr[tmp]++;
		}
    	
    	for (int i = 1; i < cntArr.length; i++) {
    		//수가 없다면 Pass!!
    		if(cntArr[i] == 0) {
    			continue;
    		}
    		
			//i는 숫자, cntArr[i]는 숫자의 갯수
    		for (int j = 0; j < cntArr[i]; j++) {
				bw.write(Integer.toString(i));
				bw.newLine();
			}
		}
    	
    	bw.flush();
    	
    	br.close();
    	bw.close();
    	
    	long endTime = System.currentTimeMillis(); 
    	long secDiffTime = (endTime - startTime)/1000;
    	System.out.println("수행시간(m) : "+secDiffTime);
    }
}