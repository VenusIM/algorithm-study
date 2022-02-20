package Algorithms.백준.단계별로풀어보기.기초수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1193번 문제 분수찾기
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        // 1 2 6 7  15 16 28...
        // 3 5 8  14 17 27 ...
        // 4 9  13 18 26 ...
        // 10 12 19 25 ...
        // 11 20 24...
        // 21 23 ...
        // 22 ...

        // 1, 4, 11, 22 ==> 3 + 4n씩 증가
        // 1 + 3 = 4 / 4 + (3 + 4) = 11 / 11 + (3 + 4 + 4) = 22
        int count = 1;
        int result = 1;

        while(true) {
            if(num < result + 3 + 4*(count-1)) {
                break;
            }
            result += (3 + 4*(count -1));
            count ++;
        }


        int child = (2 * count -1) - count;
        int parent = (num - result + 1);

        System.out.print(child+"/"+parent);
        System.out.println(result);
        System.out.println(num);
        System.out.println(count);
    }
}
