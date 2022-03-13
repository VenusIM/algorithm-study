package Algorithms.코딩테스트.가비아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();


        System.out.println(solution(str));
    }

    static int solution(String p) {

        int answer = -1;
        int tmp = 0;

        if(p.charAt(0) == '>' && p.charAt(p.length()-1) == '<') {
            answer = 0;
        }else if(p.charAt(0) == '>'){

            for(int i = p.length()-1; i > 0; i--) {
                if(p.charAt(i) == '<') {
                    tmp = i;
                    break;
                }
            }
            if(tmp == 0) {
                answer = p.length();
            }else {
                answer = p.length() - tmp - 1;
            }

        } else if(p.charAt(p.length()-1) == '<') {

            for(int i = 0; i < p.length(); i++) {
                if(p.charAt(i) == '>') {
                    tmp = i;
                    break;
                }
                tmp = p.length();
            }

            answer = tmp;

        } else {

            int a = 0;

            for(int i = 0; i <p.length(); i++) {
                if(p.charAt(i) == '>') {
                    a = i;
                    break;
                }
            }

            for(int i = p.length() - 1; i > a ; i--) {
                if(p.charAt(i) == '<') {
                    tmp = i;
                    break;
                }
            }

            if(tmp == 0) {
                answer = p.length();
            }else {
                answer = p.length() - (tmp - a + 1);
            }

        }

        return answer;
    }
}
