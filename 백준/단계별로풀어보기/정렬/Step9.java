package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step9 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        StringBuilder[] user = new StringBuilder[201];
        StringTokenizer stringTokenizer;

        for(int i = 0; i < count; i++) {

            stringTokenizer  = new StringTokenizer(bufferedReader.readLine());
            int age = Integer.parseInt(stringTokenizer.nextToken());

            user[age] = user[age] == null
                    ? new StringBuilder().append(stringTokenizer.nextToken()).append(" ")
                    : user[age].append(stringTokenizer.nextToken()).append(" ");
        }

        StringBuilder stringBuilder = new StringBuilder();
        String[] names;

        for(int i = 0; i < 201; i++) {
            if(user[i] != null) {
                names = user[i].toString().split(" ");

                for(int j = 0; j < names.length; j++) {
                    stringBuilder.append(i).append(" ").append(names[j]).append("\n");
                }
            }
        }

        System.out.print(stringBuilder);

    }
}
