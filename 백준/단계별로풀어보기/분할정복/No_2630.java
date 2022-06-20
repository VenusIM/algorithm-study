package Algorithms.백준.단계별로풀어보기.분할정복;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class No_2630 {
    public static int white = 0;
    public static int blue = 0;
    public static int[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        board = new int[N][N];

        StringTokenizer stringTokenizer;
        for(int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for(int j = 0; j < N; j++) board[i][j] = Integer.parseInt(stringTokenizer.nextToken());
        }

        partition(0, 0, N);
        System.out.println(white);
        System.out.println(blue);

    }

    public static void partition(int row, int col, int size) {

        if(colorCheck(row, col, size)) {
            if(board[row][col] == 0) white++;
            else blue++;
            return;
        }

        int newSize = size / 2;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
    }

    public static boolean colorCheck(int row, int col, int size) {

        int color = board[row][col];

        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(board[i][j] != color) return false;
            }
        }
        return true;
    }
}