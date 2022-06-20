package Algorithms.프로그래머스.Lv2.팁스타운2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 짝지어제거하기_시간초과 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        System.out.print(Soution(str));;
    }

    static int Soution(String str) {

        if(removeSame(str).length() == 0){
            return 1;
        }
        return 0;
    }

    static String removeSame(String str) {
        boolean flag = true;
        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                str = str.substring(0,i) + str.substring(i+2, str.length());
                flag =false;
            }
        }

        if(flag) return str;
        return removeSame(str);
    }

}
