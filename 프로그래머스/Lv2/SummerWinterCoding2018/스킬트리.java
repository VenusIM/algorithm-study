package Algorithms.프로그래머스.Lv2.SummerWinterCoding2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 스킬트리 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String skill = bufferedReader.readLine();
        String[] skill_trees = bufferedReader.readLine().split(", ");

        System.out.print(new 스킬트리().solution(skill, skill_trees));

    }

    private int solution(String skill, String[] skill_trees) {

        int answer = 0;

        for(String skill_tree : skill_trees) {

            String[] s = skill_tree.split("");

            for(int i = 0; i < s.length; i++) {

                // 스킬과 관련없는 스킬이라면 제거
                if(!skill.contains(s[i])) {
                    skill_tree = skill_tree.replace(s[i],"");
                }

            }

            //스킬 트리와 무관한 스킬을 배울 경우
            if(skill_tree.length() == 0) {
                answer++;
            }

            //스킬을 뒤에서 부터 하나씩 지워가며 동일 비교
            for(int i = skill.length(); i > 0; i--) {
                String temp = skill;
                if(skill.substring(0,i).equals(skill_tree)) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }


}
