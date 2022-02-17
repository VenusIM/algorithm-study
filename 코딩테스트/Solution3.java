package Algorithms.코딩테스트;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result3 {

    /*
     * Complete the 'bitwiseEquations' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY a
     *  2. LONG_INTEGER_ARRAY b
     */

    public static List<Long> bitwiseEquations(List<Long> a, List<Long> b) {
        List<Long> result = IntStream.range(0, a.size()).mapToObj(i -> {
            Long tmp = 0L;
            for(int j = 0; j < a.get(i)/2; j++) {
                int numA = j;
                Long numB = a.get(i) - j;

                if(Long.toBinaryString(numA ^ numB).equals(Long.toBinaryString(b.get(i)))) {
                    tmp = Long.valueOf (2*numA + 3*numB);
                    break;
                }
            }
            return tmp;
        }).collect(toList());

        return result;
    }
}

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> a = IntStream.range(0, aCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Long::parseLong)
                .collect(toList());

        int bCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> b = IntStream.range(0, bCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Long::parseLong)
                .collect(toList());

        List<Long> result = Result3.bitwiseEquations(a, b);
        System.out.println(result);

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}