package Algorithms.회사.ssg;

import java.util.*;

public class Solution2 {

    public String[] solution(String[] logs) {

        // 문제의 개수
        int count = 0;

        //학생 정보와 문제수를 담아줄 info Map 인스턴스 생성
        Map<String, Map<String, String>> info = new HashMap<>();

        //정보를 담아준다.
        for(int i = 0; i < logs.length-1; i++) {
            //수험 번호
            StringTokenizer stringTokenizer = new StringTokenizer(logs[i]);
            String no = stringTokenizer.nextToken();
            String question = stringTokenizer.nextToken();
            String score = stringTokenizer.nextToken();
            // 수험 번호를 포함하고 있는 경우 1증가, 아닌 경우 새로운 수험번호 입력
            if(info.containsKey(no)) {
                if(info.get(no).containsKey(question)) {
                    info.get(no).put(question,score);
                }else {
                    count++;
                }
            }else {
                Map<String, String> temp = new HashMap<String, String>();
                temp.put(question,score);
                info.put(no, temp);
            }
        }

        // 문항수가 5문제 미만이라면 "None"을 return
        if(count < 5) {
            return new String[]{"None"};
        }
        String[] answer = check(info);
        Arrays.sort(answer);
        return answer;
    }

    static String[] check(Map<String, Map<String, String>> info) {

        //info에 담은 정보를 하나씩 뽑는다.
        Iterator<String> iterator = info.keySet().iterator();
        //기준 수험 번호를 선정
        String standard_key = iterator.next();
        Map standard_map = info.get(standard_key);
        Iterator<String> standard = standard_map.keySet().iterator();

        boolean flag = true;
        Map<String, String> tmp = new HashMap<>();
        while (iterator.hasNext()) {
            //비교 대상 수험 번호
            String compare_key = iterator.next();
            Map compare_map = info.get(compare_key);
            Iterator<String> compare = compare_map.keySet().iterator();

            while(standard.hasNext()) {
                String question = standard.next();
                String score = (String) standard_map.get(question);
                flag = true;
                while(compare.hasNext()) {
                    String temp = compare.next();
                    if(!(question.equals(temp) && score.equals( (String) compare_map.get(temp) ))) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    tmp.put(standard_key,"");
                    tmp.put(compare_key,"");
                }
            }
        }
        String[] answer = new String[tmp.size()];
        if(flag) {
            int temp = 0;
            for(String no : tmp.keySet()) {
                answer[temp] = no;
                temp++;
            }
            return answer;
        }else{
            info.remove(standard_key);
        }
        return check(info);

    }

}
