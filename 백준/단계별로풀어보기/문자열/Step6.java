package Algorithms.백준.단계별로풀어보기.문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 1152 문제 단어의 개수
public class Step6 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        if(str.equals("") || str.equals(" ")){
            System.out.print(0);
            return;
        }

        String[] strs = str.split(" ");

        boolean first = strs[0].equals("");;
        boolean second = strs[strs.length-1].equals("");

        if(first && second) {
            System.out.print(strs.length-2);
        }else if(first || second) {
            System.out.print(strs.length-1);
        }else{
            System.out.print(strs.length);
        }
    }
}
