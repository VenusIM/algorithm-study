package Algorithms.코딩테스트;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result2 {

    /*
     * Complete the 'findRange' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER num as parameter.
     */

    public static long findRange(int num) {
        char[] nums = Integer.toString(num).toCharArray();
        char[] tmps =  nums;
        long result = 123123;
        char min = nums[0];
        char max = 0;
        char tmp;

        for(int i = 1; i < nums.length; i++) {
            for(int j = 1; j < nums.length; j++) {
                if(nums[j+1] < nums[j] ) {
                    tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            }
            for(int j = 1; j < nums.length; j++) {
                if(tmps[j] < min) {
                    min = tmps[j];
                }
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(min < nums[i]) {
                max = nums[i];
                break;
            }
        }
        for(char ch : nums) {
            System.out.print(ch);
        }

        System.out.println(min);
        System.out.println(max);

        return result;
    }

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int num = Integer.parseInt(bufferedReader.readLine().trim());

        char[] nums = Integer.toString(num).toCharArray();
        char[] tmps = Integer.toString(num).toCharArray();

        char min = nums[0];
        char max = 0;
        char tmp;

        for(int i = 1; i < nums.length; i++) {
            for(int j = 1; j < nums.length; j++) {
                if(nums[j] < nums[j-1] ) {
                    tmp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = tmp;
                }
            }

            for(int j = 1; j < nums.length; j++) {
                if(tmps[j] < min) {
                    min = tmps[j];
                }
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(min < nums[i]) {
                max = nums[i];
                break;
            }
        }

        if(min == '0' && max == tmps[0]) {
            min = max;
            for(int i = 0; i < nums.length; i++) {
                if(min < nums[i]) {
                    max = nums[i];
                    break;
                }
            }
        }

        StringBuilder maximum = new StringBuilder();
        StringBuilder minimum = new StringBuilder();
        char[] maxNums = Integer.toString(num).toCharArray();
        char[] minNums = Integer.toString(num).toCharArray();

        if(nums[0] == '0' && min == nums[nums.length-1]) {
            min = '0';
            max = nums[nums.length-1];

            for(int i = 0; i < nums.length; i++) {
                if(tmps[i] == min) {
                    maxNums[i] = '9';
                }
                if(tmps[i] == max) {
                    minNums[i] = '1';
                }
                maximum.append(maxNums[i]);
                minimum.append(minNums[i]);
            }

        }else{
            for(int i = 0; i < nums.length; i++) {
                if(tmps[i] == min) {
                    maxNums[i] = '9';
                }
                if(tmps[i] == max) {
                    minNums[i] = '0';
                }
                maximum.append(maxNums[i]);
                minimum.append(minNums[i]);
            }
        }

        long kkk = Long.parseLong(maximum.toString()) - Long.parseLong(minimum.toString());
        System.out.println(kkk);

//        long result = Result.findRange(num);
//        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
