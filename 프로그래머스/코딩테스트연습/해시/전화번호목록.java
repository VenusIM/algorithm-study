package 프로그래머스.코딩테스트연습.해시;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 전화번호목록 {
    public static void main(String[] args) {

        String[] phone_book1 = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book1));

        String[] phone_book2 = {"123","456","789"};
        System.out.println(solution(phone_book2));

        String[] phone_book3 = {"12","123","1235","567","88"};
        System.out.println(solution(phone_book3));

    }

    private static boolean solution(String[] phone_book) {

        boolean answer = true;
        Map<String, String> phone_map = new HashMap<>();

        //값의 유무 비교를 위해 HashMap의 key값으로 셋팅
        for(String number : phone_book) phone_map.put(number,null);

        /* 시간 초과 코드

        Iterator<String> key = phone_map.keySet().iterator();
        while(key.hasNext()) {
            String val = (String) key.next();
            for (int i = 0; i < phone_book.length; i++) {
                int length = val.length();
                //만약 동일한 번호이거나 비교 대상보다 짧다면 넘어감
                if(length > phone_book[i].length() || val.equals(phone_book[i])) continue;

                if(val.equals(phone_book[i].substring(0, length))) {
                    answer = false;
                }
            }
        }

        */

        /* ==> 개선
        Iterator를 사용하여 Map의 키값을 뽑아서 비교하여 시간 복잡도가 증가했던 코드 Map의 key를 이용하여 O(1)로 개선
         */
        for(int i = 0 ; i < phone_book.length; i++) {
            String number = phone_book[i];
            for(int j = 0; j < number.length(); j++) {
                if(phone_map.containsKey(number.substring(0,j))) answer = false;
            }
        }
        return answer;
    }
}
