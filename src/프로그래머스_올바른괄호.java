import java.io.IOException;
import java.util.ArrayDeque;

public class 프로그래머스_올바른괄호 {
    static class Solution {
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        boolean solution(String s) {
            boolean answer = true;

            for (int i = 0; i < s.length(); i++) {
                char charTmp = s.charAt(i);
                if(Character.compare(charTmp, '(') == 0) {
                    stack.addLast(charTmp);
                }else {     // ")"의 경우
                    if(stack.size() != 0) {
                        stack.removeLast();
                    }else {
                        answer = false;
                    }
                }
            }
            if(!stack.isEmpty()) {
                answer = false;
            }

            return answer;
        }
    }

    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        System.out.println(sol.solution("(())()"));;
    }
}
