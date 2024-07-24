package com.completed;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 백준_1264 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        ArrayList<String> inputList = new ArrayList<>();

        while(true) {
            String tmp = br.readLine();
            if(tmp.equals("#")) {
                break;
            }else {
                inputList.add(tmp);
            }
        }

        //////

        for(String tmp : inputList) {
            String modifiedTmp = tmp;
            modifiedTmp = modifiedTmp.replaceAll("a", "");
            modifiedTmp = modifiedTmp.replaceAll("e", "");
            modifiedTmp = modifiedTmp.replaceAll("i", "");
            modifiedTmp = modifiedTmp.replaceAll("o", "");
            modifiedTmp = modifiedTmp.replaceAll("u", "");
            modifiedTmp = modifiedTmp.replaceAll("A", "");
            modifiedTmp = modifiedTmp.replaceAll("E", "");
            modifiedTmp = modifiedTmp.replaceAll("I", "");
            modifiedTmp = modifiedTmp.replaceAll("O", "");
            modifiedTmp = modifiedTmp.replaceAll("U", "");
            bw.write(Integer.toString(tmp.length() - modifiedTmp.length()));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}