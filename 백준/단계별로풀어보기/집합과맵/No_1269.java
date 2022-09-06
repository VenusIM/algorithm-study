package 백준.단계별로풀어보기.집합과맵;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class No_1269 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int countA = Integer.parseInt(stringTokenizer.nextToken());
        int countB = Integer.parseInt(stringTokenizer.nextToken());

        Map<String, Integer> mapA = new HashMap<String, Integer>();
        Map<String, Integer> mapB = new HashMap<String, Integer>();
        Map<String, Integer> temp = new HashMap<String, Integer>();

        String key = "";
        int value = 0;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        for(int i = 0; i < countA; i++) {
            key = stringTokenizer.nextToken();
            value = mapA.get(key) == null ? 1 : mapA.get(key) + 1;
            mapA.put(key, value);
            temp.put(key, value);
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        for(int i = 0; i < countB; i++) {
            key = stringTokenizer.nextToken();
            value = mapB.get(key) == null ? 1 : mapB.get(key) + 1;
            mapB.put(key,value);
        }

        Iterator<String> iterator = mapB.keySet().iterator();
        while (iterator.hasNext()){
            key = iterator.next();
            if(temp.containsKey(key)) {
                value = temp.get(key) - mapB.get(key);
                if(value <= 0) temp.remove(key);
            }
        }

        iterator = mapA.keySet().iterator();
        while (iterator.hasNext()){
            key = iterator.next();
            if(mapB.containsKey(key)) {
                value = mapB.get(key) - mapA.get(key);
                if(value <= 0) mapB.remove(key);
            }
        }

        bufferedWriter.write(String.valueOf(mapB.size() + temp.size()));
        bufferedWriter.close();
        bufferedReader.close();

    }
}
