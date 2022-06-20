package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//3053 택시 기하학
public class Step10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Double R = Double.parseDouble(bufferedReader.readLine());
        System.out.printf("%.6f",R*R*Math.PI);
        System.out.println();
        System.out.printf("%.6f",2*R*R);
    }
}
