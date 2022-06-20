package Algorithms.백준.단계별로풀어보기.함수;

// 15596 제목 정수 N개의 합
public class No_15596 {

    long sum(int[] a) {

        long result = 0L;
        for(int num : a) {
            result += num;
        }

        return result;
    }
}
