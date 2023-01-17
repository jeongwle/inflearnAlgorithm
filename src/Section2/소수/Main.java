package Section2.소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int[] ERATOSTHENES = new int[200_001];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        for (int i = 2; i < ERATOSTHENES.length; i++) {
            if (ERATOSTHENES[i] == 1) {
                continue;
            }
            for (int j = i * 2; j < ERATOSTHENES.length; j += i) {
                ERATOSTHENES[j] = 1;
            }
        }

        int result = 0;
        for (int i = 2; i <= N; i++) {
            if (ERATOSTHENES[i] == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
