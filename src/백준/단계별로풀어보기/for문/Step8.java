package src.백준.단계별로풀어보기.for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 11022 문제 A+B-7
public class Step8 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < count; i++) {

            String[] numberList = bufferedReader.readLine().split(" ");
            int A = Integer.parseInt(numberList[0]);
            int B = Integer.parseInt(numberList[1]);
            String tmp = "Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B)+"\n";
            if(i == count-1){
                tmp = "Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B);
            }
            stringBuffer.append(tmp);
        }
        System.out.println(stringBuffer);
    }
}
