package Algorithms.코딩테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine().trim());

//        int min = 10;
//        int max = 0;
//        int n = num;
//        int value = 0;
//
//        Stack<Integer> stack = new Stack<>();
//        //min, max value
//        while(0 < n) {
//            value = n%10;
//            stack.push(value);
//            if(value < min) min = value;
//            if(value > max) max = value;
//            n /= 10;
//        }
//
//        StringBuilder maxString = new StringBuilder();
//        StringBuilder minString = new StringBuilder();
//        boolean check = false;
//        while(!stack.isEmpty()) {
//            value = stack.pop();
//
//            if(value == min) maxString.append(9);
//            else maxString.append(value);
//
//            if(minString.length() == 0 && value == max) check = true;
//
//            if(check && value == max) minString.append(1);
//            else if(value == max) minString.append(0);
//            else minString.append(value);
//
//        }
//
//        System.out.println(maxString);
//        System.out.println(minString);

        int n = num;

        int ninefirst = 10;
        int onefirst = 10;
        int count = 0;

        Stack<Integer> stack = new Stack<>();
        //min, max value
        while(0 < n) {
            if(n == 9) ninefirst = 9;
            if(n == 1) onefirst = 1;
            stack.push(n%10);
            n /= 10;
            count ++;
        }

        int a = num;
        if(ninefirst < 10) {
            n = 1;
            while(1 < count) {
                n*=10;
                count--;
            }

            while(0<n) {
                if(a/n != 9) {
                    ninefirst = a/n;
                    break;
                }
                a = a % n;
                n /= 10;
            }
        }

        a = num;
        if(onefirst < 10) {
            n = 1;
            while(1 < count) {
                n*=10;
                count--;
            }

            while(0<n) {
                if(a/n != 1) {
                    onefirst = a/n;
                    break;
                }
                a = a % n;
                n /= 10;
            }

        }

        int temp;
        int max = 10;
        int min = 10;

        StringBuilder maxString = new StringBuilder();
        StringBuilder minString = new StringBuilder();

        while(!stack.isEmpty()) {
            temp = stack.pop();

            if(9 < max && 9 < ninefirst) {
                max = temp;
            }

            if(9 < min && 9 < onefirst) {
                min = temp;
            }

            if(ninefirst < 10) {
                if(temp == ninefirst) maxString.append(9);
                else maxString.append(temp);
            } else {
                if(max == temp) maxString.append(9);
                else maxString.append(temp);
            }

            if(onefirst < 10) {
                if(temp == onefirst) minString.append(0);
                else minString.append(temp);
            } else if (ninefirst < 10){
                if(min == temp) minString.append(1);
                else minString.append(temp);
            } else {
                if(min == temp) minString.append(0);
                else minString.append(temp);
            }

        }
        System.out.println(ninefirst);
        System.out.println(maxString);
        System.out.println(minString);

    }
}
