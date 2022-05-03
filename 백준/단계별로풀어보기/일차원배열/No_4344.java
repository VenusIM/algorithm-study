package Algorithms.백준.단계별로풀어보기.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_4344 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        String[] strs;
        double avg;
        double[] avgs = new double[count];

        for(int i = 0; i < count; i++) {

            strs = bufferedReader.readLine().split(" ");
            int total = 0;

            for(int j = 1; j < strs.length; j++) {
                total += Integer.parseInt(strs[j]);
            }

            avg = total/Integer.parseInt(strs[0]);
            double check = 0;

            for(int k = 1; k < strs.length; k++) {
                if(avg < Integer.parseInt(strs[k])) {

                    check++;
                }
            }

            avgs[i] = check/(strs.length-1);

        }

        for(double num : avgs) {
            System.out.printf("%.3f%%",num*100);
        }
    }
}
