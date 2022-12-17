import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int length, N;
        HashSet<String>[] wordArr;
        ArrayList<String> tempList;

        st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());

        wordArr = new HashSet [51];


        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            length = word.length();

            if(wordArr[length] == null) {
                wordArr[length] = new HashSet<String>();
            }
            wordArr[length].add(word);
        }

        for(int i=1; i<=50; i++) {   //단어 길이 1 ~ 50까지 반복
            if(wordArr[i] != null) {
                tempList = new ArrayList<String>(wordArr[i]);
                Collections.sort(tempList);

                for(int j=0; j<tempList.size(); j++) {
                    bw.write(tempList.get(j));
                    bw.newLine();
                }
            }
        }

        bw.flush();
        bw.close();
    }


}