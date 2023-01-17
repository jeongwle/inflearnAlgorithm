package Section2.뒤집은소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final int[] ERATOSTHENES = new int[100_001];
    static {
        ERATOSTHENES[0] = ERATOSTHENES[1] = 1;
        for (int i = 2; i < ERATOSTHENES.length; i++) {
            if (ERATOSTHENES[i] == 1) {
                continue;
            }
            for (int j = i * 2; j < ERATOSTHENES.length; j += i) {
                ERATOSTHENES[j] = 1;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        bf.readLine();
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());
            int reverseNumber = reverse(number);
            if (ERATOSTHENES[reverseNumber] == 0) {
                sb.append(reverseNumber)
                        .append(" ");
            }
        }
        System.out.println(sb);
    }

    private static int reverse(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        sb.reverse();
        return Integer.parseInt(String.valueOf(sb));
    }
}
