import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Iterator;

class Solution3 {
    public long[][] solution(String[] record) {
        //id와 k값
        Map<Integer, Integer> sit = new HashMap<>();
        //id와 index 위치
        Map<Integer, Integer> index = new HashMap<>();
        //좌석 정보를 하나씩 뽑는다.
        for(int i = 0; i < record.length; i++) {
            // 좌석 정보
            String info = record[i];
            StringTokenizer stringTokenizer = new StringTokenizer(info," ");

            int id = Integer.parseInt(stringTokenizer.nextToken().replace("id=",""));
            String command = stringTokenizer.nextToken();
            int k = Integer.parseInt(stringTokenizer.nextToken().replace("k=",""));
            sit.put(id, k);

            //좌석
            ArrayList<Integer> chair = new ArrayList<>();
            //이탈 정보
            Map<Integer, Boolean> leave = new HashMap<>();
            //현재 체워져 있는 자리 수
            int current = chair.size();
            if(command.equals("sit")) {

                if(!leave.isEmpty()) {
                    Iterator iterator = leave.keySet().iterator();
                    for(Integer tmp : leave.keySet()) {
                        if(k < sit.get(tmp)) {
                            index.put(id, index.get(sit.get(tmp)));
                        }
                    }
                }

                // 음수 일 경우 0부터 시작
                current -= k;
                if(current < 0) current = 0;

                for(int j = current; j < 2*k+1; j++) {
                    if(chair.contains(j)) continue;
                    chair.add(j);
                }
                //id와 좌석 위치 정보 저장
                index.put(id, chair.size()-k);
            }
            // 떠날 경우 좌석 정보
            else {
                leave.put(id, true);
            }

        }

        Iterator<Integer> iterator = index.keySet().iterator();
        long[][] answer = new long[index.size()][2];
        int i = 0;
        for(Integer tmp : index.keySet()) {
            answer[i][0] = tmp;
            answer[i][1] = index.get(tmp);
            i++;
        }

        return answer;
    }
}