package com.completed;
import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class 백준_17298 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N;
        int [] A;
        int [] answer;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        A = new int [N];
        answer = new int [N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());

        }

        //

        for (int i = N - 1; i >= 0; i--) {  //O(N)
            if(i == N - 1) {    //맨 마지막 거
                answer[i] = -1;
                stack.addLast(A[i]);
            }else {
                while(stack.size() != 0 && stack.peekLast() <= A[i]) {    //기존 스택에 들어있는 값들 중에 새로 들어온 값보다 작을 경우 pop시킴
                    stack.removeLast();
                }
                if(stack.size() == 0) {
                    answer[i] = -1;
                }else {
                    answer[i] = stack.peekLast();
                }
                stack.addLast(A[i]);
            }
        }
        for (int i = 0; i < N; i++) {   //O(N)
            bw.write((answer[i]) + " ");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}