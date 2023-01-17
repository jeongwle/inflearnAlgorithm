package Section2.봉우리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[][] mountain;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        mountain = new int[N + 2][N + 2];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            for (int j = 1; j <= N; j++) {
                mountain[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                if (isSummit(i, j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isSummit(int row, int col) {
        int target = mountain[row][col];

        return (target > mountain[row + 1][col] && target > mountain[row - 1][col]
                && target > mountain[row][col + 1] && target > mountain[row][col - 1]);
    }
}
