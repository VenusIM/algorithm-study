package Algorithms.백준.단계별로풀어보기.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1193번 문제 분수찾기
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        // 01 02 06 07 15 16 28 29 45...
        // 03 05 08 14 17 27 30 44...
        // 04 09 13 18 26 31 43 ...
        // 10 12 19 25 32 42 ...
        // 11 20 24 33 41 ...
        // 21 23 34 40...
        // 22 35 39...
        // 36 38...
        // 37 ...

        // 1, 4, 11, 22 ==> 3 + 4(n -1)씩 증가
        // 1 + 3 = 4 / 4 + (3 + 4) = 11 / 11 + (3 + 4 + 4) = 22 / 22 + (3 + 4 + 4 + 4) = 37
//        int count = 1;
//        int result = 1;
//
//        StringBuilder stringBuilder = new StringBuilder();
//
//        // 첫번째 일 경우
//        if(num == 1) {
//
//            stringBuilder
//                    .append(1)
//                    .append("/")
//                    .append(1);
//
//        // 이외의 경우
//        } else {
//
//            while(true) {
//                if(num < result + 3 + 4*(count-2)) {
//                    break;
//                }
//                result += (3 + 4*(count -1));
//                count ++;
//            }
//
//            int parent = num - result + 1;
//            int child = 2*count - (num - result) -1;
//
//            if(num < result) {
//                parent = result - num;
//                child = 2*(count -1) - parent + 1;
//            }
//
//            stringBuilder
//                    .append(child)
//                    .append("/")
//                    .append(parent);
//        }
//        System.out.print(stringBuilder.toString());

        int compare = 1;
        int append = 0;
        int count = 0;

        while(compare <= num) {
            append ++;
            count ++;
            compare += append;
        }

        StringBuilder stringBuilder = new StringBuilder();

        int tmp = compare - append;
        int diff = num - tmp;

        if(tmp == num && count % 2 == 0) {

            stringBuilder
                    .append(1)
                    .append("/")
                    .append(count);

        } else if(tmp == num && count % 2 != 0) {

            stringBuilder
                    .append(count)
                    .append("/")
                    .append(1);

        } else if(count % 2 == 0) {

            stringBuilder
                    .append(1 + diff)
                    .append("/")
                    .append(count - diff);

        } else {

            stringBuilder
                    .append(count - diff)
                    .append("/")
                    .append(1 + diff);

        }

        System.out.print(stringBuilder);
    }
}
