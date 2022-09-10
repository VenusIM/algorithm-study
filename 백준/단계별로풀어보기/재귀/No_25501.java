package 백준.단계별로풀어보기.재귀;

import java.io.*;

/**
 * BufferedWriter의 경우 버퍼가 가득 찼을 경우 자동 flush를 한다.
 * 따라서 BufferedWriter 보다 StringBuilder가 성능면에서 좋다.
 */

public class No_25501 {

    static int PUBLIC_COUNT;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());
        String str;
        int len;
        char[] chars;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < count; i++) {

            str = bufferedReader.readLine();
            len = str.length();
            chars = new char[len];

            for(int j = 0; j < len; j++) {
                chars[j] = str.charAt(j);
            }
            PUBLIC_COUNT = 1;
//            bufferedWriter.write(String.valueOf(isPalindrome(chars, len))+" "+PUBLIC_COUNT);
            stringBuilder.append(isPalindrome(chars, len)).append(" ").append(PUBLIC_COUNT);
            if(i < count-1) {
//                bufferedWriter.write("\n");
                stringBuilder.append("\n");
            }
        }
//        bufferedWriter.close();
        System.out.print(stringBuilder);
        bufferedReader.close();
    }

    static int recursion(char[] s, int l, int r){
        if(l >= r) return 1;
        else if(s[l] != s[r]) return 0;
        else {
            PUBLIC_COUNT++;
            return recursion(s, l+1, r-1);
        }
    }

    static int isPalindrome(char[] s, int len){
        return recursion(s, 0, len-1);
    }

}
