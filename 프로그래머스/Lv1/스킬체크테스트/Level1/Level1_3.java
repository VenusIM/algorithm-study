package Algorithms.프로그래머스.Lv1.스킬체크테스트.Level1;

public class Level1_3 {

    static void solution(String s) {
        char c;
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < numStr.length; i++) {
            s = s.replaceAll(numStr[i], String.valueOf(i));
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        solution("23four5six7");
    }
}
