package Section2.등수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final Integer[] COUNT = new Integer[101];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[] scores = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (COUNT[scores[i]] == null) {
                COUNT[scores[i]] = 1;
            } else {
                COUNT[scores[i]]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int score : scores) {
            sb.append(1 + getPlusRanking(score))
                    .append(" ");
        }
        System.out.println(sb);
    }

    private static int getPlusRanking(int number) {
        int plus = 0;
        for (int i = 100; i > number; i--) {
            if (COUNT[i] != null) {
                plus += COUNT[i];
            }
        }
        return plus;
    }
}
