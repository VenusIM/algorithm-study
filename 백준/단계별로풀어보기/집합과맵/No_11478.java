package 백준.단계별로풀어보기.집합과맵;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class No_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = bufferedReader.readLine();
        int count = str.length() + 1;

        int end = 1;
        int start = 0;
        String value;

        Set<String> set = new HashSet<String>();

        while (true) {
            set.add(str.substring(start, start+end));
            start++;
            if(count == start+end) {
                end++;
                start = 0;
            }
            if(count == end) break;
        }

        bufferedWriter.write(String.valueOf(set.size()));
        bufferedWriter.close();
        bufferedReader.close();

    }
}
