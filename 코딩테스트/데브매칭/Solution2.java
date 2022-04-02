package Algorithms.코딩테스트.데브매칭;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        String[] grid = {"??b","abc","cc?"};
        System.out.print(solution(grid));
    }

    static int solution(String[] grid) {
        int answer = -1;

        String tmp;
        String[] strs;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < grid.length; i++) {
            tmp = grid[i];
            strs = tmp.split("");
            for(int j = 0; j < strs.length; j++) {
                if(strs[j].equals("?")) {
                    map.put(i,j);
                }
            }
        }
        for(int i = 0; i < map.size(); i++) {
            char left = 0;
            char right = 0;
            char top = 0;
            char bottom = 0;
            if(map.containsKey(0)) {
                left = grid[0].charAt(1);
                right = grid[1].charAt(0);

                if(left == right) {

                }
            }

        }

        return answer;
    }
}
