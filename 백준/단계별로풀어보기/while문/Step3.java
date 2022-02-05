package Algorithms.백준.단계별로풀어보기.while문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 1110 문제 더하기 사이클
public class Step3 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        int firstNum = Integer.parseInt(str);
        int a ;
        int b ;

        if (firstNum == 1) {
            System.out.print(60);
            return;
        } else if (firstNum == 0) {
            System.out.print(1);
            return;
        } else if (firstNum < 10) {
            a = 0;
            b = firstNum;
        }else {
            a = Integer.parseInt(Character.toString(str.charAt(0)));
            b = Integer.parseInt(Character.toString(str.charAt(1)));
        }

        int compareNum = 0;
        int count = 0;
        int tmp;

        while (firstNum != compareNum) {

            count++;

            tmp = a + b; //8

            if (10 <= a + b) {
                tmp = Integer.parseInt(Character.toString(Integer.toString(a + b).charAt(1))); //4
            }

            a = b; // a = 6
            b = tmp; // b = 8

            compareNum = Integer.parseInt(a + "" + b); //compareNum = 68

        }
        System.out.print(count);
    }
}
