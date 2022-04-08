package Algorithms.백준.단계별로풀어보기.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2869번 문제 달팽이는 올라가고 싶다
public class Step4 {
    public static void main(String[] args) throws IOException {

        // 시간초과
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] nums = bufferedReader.readLine().split(" ");
//
//        int afternoon = Integer.parseInt(nums[0]);
//        int night = Integer.parseInt(nums[1]);
//        int distance = Integer.parseInt(nums[2]);
//        int current = 0;
//        int day = 0;
//
//        while(current < distance) {
//            day ++;
//            current += afternoon;
//            if(current < distance) {
//                current -= night;
//            }
//        }
//
//        System.out.print(day);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = bufferedReader.readLine().split(" ");

        int afternoon = Integer.parseInt(nums[0]);
        int night = Integer.parseInt(nums[1]);
        int distance = Integer.parseInt(nums[2]);

        if(afternoon == distance) {
            System.out.print(1);
        }else {
            int days = (distance - afternoon)/ (afternoon - night);
            distance -= days * (afternoon - night);

            if(distance == 0) {
                System.out.print(days);
                return;
            }

            while(true) {
                days ++;
                distance -= afternoon;
                if(distance <= 0) {
                    break;
                }
                distance += night;

            }
            System.out.print(days);
        }
    }
}
