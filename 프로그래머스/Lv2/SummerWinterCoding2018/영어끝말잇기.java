package 프로그래머스.Lv2.SummerWinterCoding2018;

import java.util.HashMap;
import java.util.Map;

public class 영어끝말잇기 {
    static int[] solution(int n, String[] words) {

        int length;
        int beforeLength;

        String word;
        String before = "";
        Map<String, String> map = new HashMap<>();

        int index = 0;

        for(int i = 0; i < words.length; i++) {
            word = words[i];
            beforeLength = before.length();
            length = word.length();

            if(length < 2) {
                index = i;
                break;
            }

            if(beforeLength > 0 && word.indexOf(before.substring(beforeLength - 1, beforeLength)) != 0) {
                index = i;
                break;
            }

            if(map.get(word) != null) {
                index = i;
                break;
            }

            before = word;
            map.put(word ,word);
        }

        int[] answer = new int[2];
        if(index != 0) {
            int temp = (index + 1) % n;
            if(temp == 0) {
                answer[0] = n;
                answer[1] = (index + 1) / n;
            } else {
                answer[0] = temp;
                answer[1] = (index + 1) / n + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        System.out.println("["+answer[0]+","+answer[1]+"]");

        answer = solution(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        System.out.println("["+answer[0]+","+answer[1]+"]");

        answer = solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"});
        System.out.println("["+answer[0]+","+answer[1]+"]");


    }
}
