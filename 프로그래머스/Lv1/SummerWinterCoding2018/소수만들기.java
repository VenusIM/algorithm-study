package Algorithms.프로그래머스.Lv1.SummerWinterCoding2018;

public class 소수만들기 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        System.out.println(solution3_1(nums));
    }

    static int solution3_1(int[] nums){

        int answer = 0;
        int tmp;
        int check = 0;

        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j+1; k < nums.length; k++) {

                    tmp = nums[i] + nums[j] + nums[k];
                    check = 0;

                    for(int l = 2; l <= tmp/2; l++) {
                        if(tmp % l == 0) check ++;
                    }
                    if(check == 0) answer++;
                }
            }
        }
        return answer;
    }
}
