package com.completed;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 백준_11659 {
    private static final int MAX_VALUE = 100_000;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N, M;
        int [] tmpIntArr, sumArr, aArr, bArr;

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        tmpIntArr = new int [N + 1];
        sumArr = new int [N + 1];
        aArr = new int [M];
        bArr = new int [M];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            tmpIntArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            aArr[i] = Integer.parseInt(st.nextToken());
            bArr[i] = Integer.parseInt(st.nextToken());
        }

        //////

        for (int i = 1; i <= N; i++) {  //O(N)
            sumArr[i] = sumArr[i - 1] + tmpIntArr[i];
        }

        for (int i = 0; i < M; i++) {   //O(1)
            int largeNum = sumArr[bArr[i]];
            int smallNum = sumArr[aArr[i]];
            bw.write(Integer.toString( largeNum - smallNum + tmpIntArr[aArr[i]]));
            bw.newLine();
        }
        //총 시간복잡도 : O(N)
        bw.flush();
        bw.close();

    }
}
