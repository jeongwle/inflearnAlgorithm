package Section2.격자판최대합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[][] grid = new int[N][N];

        for (int i = 0; i < grid.length; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;

        // 가로
        for (int[] row : grid) {
            int sum = 0;
            for (int element : row) {
                sum += element;
            }
            max = Math.max(sum, max);
        }
        // 세로
        for (int i = 0; i < grid.length; i++) {
            int sum = 0;
            for (int[] row : grid) {
                sum += row[i];
            }
            max = Math.max(sum, max);

        }

        // 대각선 \
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += grid[i][i];
        }
        max = Math.max(max, sum);

        // 대각선 /
        sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += grid[i][N - i - 1];
        }
        max = Math.max(max, sum);

        System.out.println(max);
    }
}
