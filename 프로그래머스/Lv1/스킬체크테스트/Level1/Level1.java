package Algorithms.프로그래머스.Lv1.스킬체크테스트.Level1;

import java.util.StringTokenizer;

public class Level1 {

    public static String solution(String s) {
        String temp;
        char chr;

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {

            chr = s.charAt(i);
            if(chr == ' ') {
                index = 0;
                stringBuilder.append(' ');
                continue;
            }

            if (index % 2 == 0) {
                temp = String.valueOf(s.charAt(i)).toUpperCase();
            } else {
                temp = String.valueOf(s.charAt(i)).toLowerCase();
            }

            index++;
            stringBuilder.append(temp);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("t he wor"));
    }


}
