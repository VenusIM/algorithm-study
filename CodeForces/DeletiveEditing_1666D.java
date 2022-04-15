package Algorithms.CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DeletiveEditing_1666D {

//    Daisy loves playing games with words. Recently, she has been playing the following Deletive Editing word game with Daniel.
//    Daisy picks a word, for example, "DETERMINED". On each game turn, Daniel calls out a letter, for example, 'E',
//    and Daisy removes the first occurrence of this letter from the word, getting "DTERMINED". On the next turn,
//    Daniel calls out a letter again, for example, 'D', and Daisy removes its first occurrence, getting "TERMINED".
//    They continue with 'I', getting "TERMNED", with 'N', getting "TERMED", and with 'D', getting "TERME".
//    Now, if Daniel calls out the letter 'E', Daisy gets "TRME", but there is no way she can get the word "TERM" if they start playing with the word "DETERMINED".
//    Daisy is curious if she can get the final word of her choice, starting from the given initial word, by playing this game for zero or more turns.
//    Your task it help her to figure this out.

//    Input
//    The first line of the input contains an integer n — the number of test cases (1≤n≤10000). The following n lines contain test cases.
//    Each test case consists of two words s and t separated by a space. Each word consists of at least one and at most 30 uppercase English letters; s is the Daisy's initial word for the game; t is the final word that Daisy would like to get at the end of the game.

//    Output
//    Output n lines to the output — a single line for each test case. Output "YES" if it is possible for Daisy to get from the initial word s to the final word t by playing the Deletive Editing game. Output "NO" otherwise.
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String string = stringTokenizer.nextToken();
            String result = stringTokenizer.nextToken();

            char s;
            char r;
            boolean flag = false;
            int tmp = 0;
            for(int j = 0; j < result.length(); j++) {
                r = result.charAt(j);
                for(int k = tmp; k < string.length(); k++) {
                    tmp = k;
                    s = string.charAt(k);

                    if(r == s) {

                        for(int l = k+1; l < string.length(); l++) {
                            if(s == string.charAt(l)) {
                                flag = true;
                                break;
                            }
                        }
                    }
                    if(flag) break;
                }
                if(flag) break;
            }
            if(flag) stringBuilder.append("No");
            else stringBuilder.append("YES");
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);

    }
}
