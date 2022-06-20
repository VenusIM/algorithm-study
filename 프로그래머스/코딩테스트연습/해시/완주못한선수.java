package Algorithms.프로그래머스.코딩테스트연습.해시;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 완주못한선수 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.print(solution(participant, completion));
    }

    private static String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<>();

        //참가자 목록을 맵에 넣어 준다. 동명이인의 경우 key 값을 1 증가시킨다.
        for(String str : participant) {
            if(map.containsKey(str)) map.put(str, map.get(str)+1);
            else map.put(str,1);
        }

        //참가자를 확인하여 인원수를 파악하여 제거
        for(String str : completion) {
            if(map.get(str) == 1) map.remove(str);
            else map.put(str, map.get(str)-1);
        }

        //Iterator를 이용하여 map의 값을 출력
        Iterator iterator = map.keySet().iterator();

        return (String) iterator.next();
    }
}

