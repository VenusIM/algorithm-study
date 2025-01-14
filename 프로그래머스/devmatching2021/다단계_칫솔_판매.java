package Algorithms.프로그래머스.devmatching2021;

import java.util.*;
public class 다단계_칫솔_판매 {

    private final String center = "-";
    private Map<String, String> bridge = new LinkedHashMap<>();
    private Map<String, Integer> amountMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};

        new 다단계_칫솔_판매().solution(enroll, referral, seller, amount);
    }

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
            
            for(int i = 0; i < referral.length; i++) {
                bridge.put(enroll[i], referral[i]);
                amountMap.put(enroll[i], 0);
            }

            for(int i = 0; i < seller.length; i++) {
                execute(bridge, amountMap, seller[i], amount[i]*100);
            }

            return amountMap.values().stream().mapToInt(Integer::intValue).toArray();
        }

        private void execute(Map<String, String> bridge, Map<String, Integer> amountMap, String seller, int amount) {
            if("-".equals(seller)) {
                return;
            }
            if(amount < 10) {
                amountMap.put(seller, amountMap.get(seller) + amount);
                return;
            } else {
                amountMap.put(seller, amountMap.get(seller) + amount - amount/10);
            }
            String referral = bridge.get(seller);
            execute(bridge, amountMap, referral, amount/10);
        }
    
}
