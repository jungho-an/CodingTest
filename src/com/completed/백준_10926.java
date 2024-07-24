package com.completed;
import java.io.*;
import java.util.StringTokenizer;

public class 백준_10926 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        String strId = st.nextToken();
        bw.write(strId + "??!");
        bw.flush();
        bw.close();
    }
}
