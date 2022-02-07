package Algorithms.백준.단계별로풀어보기.함수;

// 4673 제목 셀프 넘버
public class Step2 {

    public static void main(String[] args) {
        boolean[] validation = new boolean[10001];

        for(int i = 1; i < 10001; i++) {
            int n = selfNumber(i);
            if(n <= 10000) {
                validation[n] = true;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i < 10001; i ++) {
            if(validation[i] == false) {
                stringBuilder.append(i).append("\n");
            }
        }

        System.out.println(stringBuilder);

    }

    private static int selfNumber(int n) {
        int total = n;

        while (n != 0) {
            total += n%10;
            n /= 10;
        }
        return total;
    }
}
