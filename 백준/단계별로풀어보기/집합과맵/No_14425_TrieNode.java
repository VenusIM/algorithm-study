package Algorithms.백준.단계별로풀어보기.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No_14425_TrieNode {
    private static class TrieNode {

        Map<Character, TrieNode> childNode = new HashMap<>();
        boolean terminal;

        TrieNode() {
            //기본 생성자
        }

        private void insert(String word) {
            TrieNode trieNode = this;
            for(int i = 0;  i < word.length(); i++) {
                char c = word.charAt(i);

                //childNode에 c가 없으면 추가
                trieNode.childNode.putIfAbsent(c, new TrieNode());
                trieNode = trieNode.childNode.get(c);

                if(i == word.length()-1) {
                    trieNode.terminal = true;
                    return;
                }
            }
        }

        private boolean contains(String word) {
            TrieNode trieNode = this;
            for(int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                TrieNode node = trieNode.childNode.get(c);
                if(node == null) return false; // 존재하지 않는 노드이므로 집합이 아니다.
                trieNode = node;
            }
            return trieNode.terminal;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        TrieNode trieNode = new TrieNode();
        for(int i = 0; i < N; i++) trieNode.insert(bufferedReader.readLine());

        int count = 0;
        for(int i = 0; i < M; i++) {
            if (trieNode.contains(bufferedReader.readLine())) count++;
        }

        System.out.print(count);
    }
}
