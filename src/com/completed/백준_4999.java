package com.completed;
import java.io.*;
import java.util.StringTokenizer;

public class 백준_4999 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int a, b;

        st = new StringTokenizer(br.readLine());
        a = st.nextToken().toString().length();

        st = new StringTokenizer(br.readLine());
        b = st.nextToken().toString().length();

        if(a < b)
            bw.write("no");
        else
            bw.write("go");

        bw.flush();
        bw.close();
    }
}
