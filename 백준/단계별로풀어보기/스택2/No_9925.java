package 백준.단계별로풀어보기.스택2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_9925 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        String regex = bufferedReader.readLine();
        int regexSize = regex.length();

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<line.length(); i++) {
            stack.push(line.charAt(i));

            if(regexSize <= stack.size()) {
                boolean flag = true;

                for(int j=0; j<regexSize; j++) {
                    if(stack.get(stack.size() - regexSize + j) != regex.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    for(int j = 0; j < regexSize; j++) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Character c : stack) {
            stringBuilder.append(c);
        }
        System.out.print(stringBuilder.length() == 0 ? "FRULA" : stringBuilder.toString());
    }
}
