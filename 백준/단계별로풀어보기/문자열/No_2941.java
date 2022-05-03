package Algorithms.백준.단계별로풀어보기.문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_2941 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        int length = str.length();
        int total = 0;

        for (int i = 0; i < length; i++) {

            char ch = str.charAt(i);

            if(ch == 'c' && i < length - 1) {
                if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    i++;
                }
            }

            else if(ch == 'd' && i < length - 1) {
                if(str.charAt(i + 1) == '-') {
                    i++;
                }
                else if(str.charAt(i + 1) == 'z' && i < length - 2) {

                    if(str.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            }

            else if((ch == 'l' || ch == 'n') && i < length - 1) {
                if(str.charAt(i + 1) == 'j') {
                    i++;
                }
            }


            else if((ch == 's' || ch == 'z') && i < length - 1) {
                if(str.charAt(i + 1) == '=') {
                    i++;
                }
            }

            total++;

        }
        System.out.print(total);
    }
}
