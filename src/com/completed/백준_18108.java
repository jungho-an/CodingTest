package com.completed;
import java.io.*;
import java.util.StringTokenizer;

public class 백준_18108 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int y, ans;
        st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        ans = y - 543;
        bw.write(Integer.toString(ans));
        bw.flush();
        bw.close();
    }
}
