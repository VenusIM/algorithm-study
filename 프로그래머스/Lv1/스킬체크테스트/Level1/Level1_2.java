package Algorithms.프로그래머스.Lv1.스킬체크테스트.Level1;

public class Level1_2 {
    static void solution(String[] babbling) {
        String[] pronounce = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        String word;
        int length;

        for(int i = 0; i < babbling.length; i ++) {
            word = babbling[i];
            length = word.length();
            for(int j = 0; j < babbling.length; j++) {
                if(length == 2) {
                    if(word.equals("ye") || word.equals("ma")) {
                        answer++;
                    }
                } else if(length == 3) {
                    if(word.equals("aya") || word.equals("woo")) {
                        answer++;
                    }
                } else if(length == 4) {
                    if(word.equals("yema") || word.equals("maye")) {
                        answer++;
                    }
                } else if (length == 5) {
                    for(int k = 0; k < 4; k ++) {
                        for(int h = 0; h < 4; h++) {
                            if(h == h) {
                                continue;
                            }
                            if(word.equals(pronounce[k]+pronounce[h])) {
                                answer++;
                            }
                        }
                    }
                } else if (length == 6) {
                    if(word.equals("ayawoo") || word.equals("wooaya")) {
                        answer++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
