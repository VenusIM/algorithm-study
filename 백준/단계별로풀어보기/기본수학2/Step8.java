package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//3009번 네번쨰점
public class Step8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] arr1 = {Integer.parseInt(stringTokenizer.nextToken()) ,Integer.parseInt(stringTokenizer.nextToken())};
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] arr2 = {Integer.parseInt(stringTokenizer.nextToken()) ,Integer.parseInt(stringTokenizer.nextToken())};
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] arr3 = {Integer.parseInt(stringTokenizer.nextToken()) ,Integer.parseInt(stringTokenizer.nextToken())};

        int x = 0;
        int y = 0;

        if(arr1[0] == arr2[0]) x = arr3[0];
        else if(arr2[0] == arr3[0]) x = arr1[0];
        else x = arr2[0];

        if(arr1[1] == arr2[1]) y = arr3[1];
        else if(arr2[1] == arr3[1]) y = arr1[1];
        else y = arr2[1];

        System.out.print(x+" "+y);
    }
}
