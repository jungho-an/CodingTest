package com.completed;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class 백준_9290 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int x;
    	String mal;
    	String[][] tic_tac_toe;    	
    	
    	List<String[][]> ticList = new ArrayList<String[][]>();
    	List<String> malList = new ArrayList<String>();
    	
    	st = new StringTokenizer(br.readLine());
    	x = Integer.parseInt(st.nextToken());
    	
    	for (int i = 0; i < x; i++) {
    		tic_tac_toe = new String[3][3];
    		mal = null;
    		
    		//틱택토 초기화
    		for (int j = 0; j < 3; j++) {
    			st = new StringTokenizer(br.readLine());
    			String tmpStr = st.nextToken();
				for (int k = 0; k < 3; k++) {
					//tic_tac_toe[j][k] = st.nextToken().StringAt(k);
					String tmpChr = tmpStr.substring(k, k + 1);
					//System.out.println(tmpChr);
					tic_tac_toe[j][k] = tmpChr;
				}
			}
    		//말 초기화
    		st = new StringTokenizer(br.readLine());
    		mal = st.nextToken().substring(0, 1);
    		
    		ticList.add(tic_tac_toe);
    		malList.add(mal);
    	}
    	
    	for (int i = 0; i < x; i++) {
    		String[][] tmpTicTacToe = ticList.get(i);
    		String tmpMal = malList.get(i);
    		
    		Loop1 :
    		// '-'인 경우에 tmpMal을 넣어서 빙고가 되는 지 확인
    		for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if(!tmpTicTacToe[j][k].equals("-")) {
						continue;						
					}
					
					if(j == 0 && k == 0) {
						if((tmpTicTacToe[0][1].equals(tmpMal) && tmpTicTacToe[0][2].equals(tmpMal)) ||
								(tmpTicTacToe[1][0].equals(tmpMal)&& tmpTicTacToe[2][0].equals(tmpMal)) ||
								(tmpTicTacToe[1][1].equals(tmpMal)&& tmpTicTacToe[2][2].equals(tmpMal))) {
							tmpTicTacToe[j][k] = tmpMal;
							break Loop1;
						}
					}else if(j == 0 && k == 1) {
						if((tmpTicTacToe[0][0].equals(tmpMal)&& tmpTicTacToe[0][2].equals(tmpMal)) ||
								(tmpTicTacToe[1][1].equals(tmpMal)&& tmpTicTacToe[2][1].equals(tmpMal))) {
							tmpTicTacToe[j][k] = tmpMal;
							break Loop1;
						}
					}else if(j == 0 && k == 2) {
						if((tmpTicTacToe[0][0].equals(tmpMal)&& tmpTicTacToe[0][1].equals(tmpMal)) ||
								(tmpTicTacToe[1][1].equals(tmpMal)&& tmpTicTacToe[2][0].equals(tmpMal)) ||
								(tmpTicTacToe[1][2].equals(tmpMal)&& tmpTicTacToe[2][2].equals(tmpMal))) {
							tmpTicTacToe[j][k] = tmpMal;
							break Loop1;
						}
					}else if(j == 1 && k == 0) {
						if((tmpTicTacToe[0][0].equals(tmpMal)&& tmpTicTacToe[2][0].equals(tmpMal)) ||
								(tmpTicTacToe[1][1].equals(tmpMal)&& tmpTicTacToe[1][2].equals(tmpMal))) {
							tmpTicTacToe[j][k] = tmpMal;
							break Loop1;
						}
					}else if(j == 1 && k == 1) {
						if((tmpTicTacToe[0][0].equals(tmpMal)&& tmpTicTacToe[2][2].equals(tmpMal)) ||
								(tmpTicTacToe[0][1].equals(tmpMal)&& tmpTicTacToe[2][1].equals(tmpMal)) ||
								(tmpTicTacToe[0][2].equals(tmpMal)&& tmpTicTacToe[2][0].equals(tmpMal)) ||
								(tmpTicTacToe[1][0].equals(tmpMal)&& tmpTicTacToe[1][2].equals(tmpMal))) {
							tmpTicTacToe[j][k] = tmpMal;
							break Loop1;
						}
					}else if(j == 1 && k == 2) {
						if((tmpTicTacToe[0][2].equals(tmpMal)&& tmpTicTacToe[2][2].equals(tmpMal)) ||
								(tmpTicTacToe[1][0].equals(tmpMal)&& tmpTicTacToe[1][1].equals(tmpMal))) {
							tmpTicTacToe[j][k] = tmpMal;
							break Loop1;
						}
					}else if(j == 2 && k == 0) {
						if((tmpTicTacToe[0][0].equals(tmpMal)&& tmpTicTacToe[1][0].equals(tmpMal)) ||
								(tmpTicTacToe[0][2].equals(tmpMal)&& tmpTicTacToe[1][1].equals(tmpMal)) ||
								(tmpTicTacToe[2][1].equals(tmpMal)&& tmpTicTacToe[2][2].equals(tmpMal))) {
							tmpTicTacToe[j][k] = tmpMal;
							break Loop1;
						}
					}else if(j == 2 && k == 1) {
						if((tmpTicTacToe[2][0].equals(tmpMal)&& tmpTicTacToe[2][2].equals(tmpMal)) ||
								(tmpTicTacToe[0][1].equals(tmpMal)&& tmpTicTacToe[1][1].equals(tmpMal))) {
							tmpTicTacToe[j][k] = tmpMal;
							break Loop1;
						}
					}else if(j == 2 && k == 2) {
						if((tmpTicTacToe[0][2].equals(tmpMal)&& tmpTicTacToe[1][2].equals(tmpMal)) ||
								(tmpTicTacToe[0][0].equals(tmpMal)&& tmpTicTacToe[1][1].equals(tmpMal)) ||
								(tmpTicTacToe[2][0].equals(tmpMal)&& tmpTicTacToe[2][1].equals(tmpMal))) {
							tmpTicTacToe[j][k] = tmpMal;
							break Loop1;
						}
					}
				}
			}
    		
    		bw.write("Case " + Integer.toString(i + 1) + ":\n");
    		for (int j = 0; j < 3; j++) {
    			for (int k = 0; k < 3; k++) {
    				bw.write(tmpTicTacToe[j][k]);
    			}
    			bw.write("\n");
    		}
		}
    	
    	//bw.write();
    	bw.flush();
    	
    	br.close();
    	bw.close();
    }
}