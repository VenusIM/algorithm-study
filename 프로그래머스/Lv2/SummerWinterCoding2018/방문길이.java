package 프로그래머스.Lv2.SummerWinterCoding2018;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 방문길이 {

    static int Solution(String dirs) {
        int answer = 0;

        int x = 0;
        int y = 0;

        String coordinateBefore = "00";
        String coordinateAfter = "";
        // -5 ~ 5 , -5 ~ 5
        Map<String, String> visit1 = new HashMap<>();
        Map<String, String> visit2 = new HashMap<>();

        int index = 0;
        char dir;
        while(index < dirs.length()) {
            dir = dirs.charAt(index);
            index++;

            switch (dir) {
                case 'U':
                    y++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
            }

            // 범위를 벗어 났을 경우
            if(x < -5) {
                x = -5;
                continue;
            } else if(5 < x) {
                x = 5;
                continue;
            } else if(y < -5) {
                y = -5;
                continue;
            } else if(5 < y) {
                y = 5;
                continue;
            }

            coordinateAfter += x;
            coordinateAfter += y;


            if(visit1.get(coordinateBefore) == null || visit2.get(coordinateAfter) == null) {
                visit1.put(coordinateBefore,coordinateAfter);
                visit2.put(coordinateAfter, coordinateBefore);
                answer++;
            }

            System.out.println(coordinateBefore + " >> " + coordinateAfter);
            System.out.println("check : "+ coordinateBefore + " >> " + visit1.get(coordinateBefore));
            System.out.println("check : "+ coordinateAfter + " >> " + visit2.get(coordinateAfter));
            System.out.println(answer);

            coordinateBefore = coordinateAfter;
            coordinateAfter = "";

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution("ULURRDLLU"));
        System.out.println(Solution("LULLLLLLU"));
    }

}
