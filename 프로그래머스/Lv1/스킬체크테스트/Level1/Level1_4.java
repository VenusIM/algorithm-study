package Algorithms.프로그래머스.Lv1.스킬체크테스트.Level1;

public class Level1_4 {
    public static void solution(int n, int m, int ... section) {

        int answer = 0;
        if(m == 1) {
            answer = section.length;
        }
        for(int i = 0; i < section.length - 1; i++) {
            if(section[i+1] - section[i] + 1 <= m) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        solution(8,4, 2,3,6);
        solution(5,4, 1,3);
        solution(4,1, 1,2,3,4);

    }
}
