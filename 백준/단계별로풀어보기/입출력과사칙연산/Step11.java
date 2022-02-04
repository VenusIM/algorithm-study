package 백준.단계별로풀어보기.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 18108 문제 1998년생인 내가 태국에서는 2541년생?
public class Step11 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine());
        year -= 543;
        System.out.println(year);
    }
}
