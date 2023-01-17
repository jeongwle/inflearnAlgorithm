package Section2.피보나치수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Integer[] fibonacci;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        fibonacci = new Integer[N];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(getFibonacci(i))
                    .append(" ");
        }
        System.out.println(sb);
    }

    private static int getFibonacci(int N) {
        if (N == 0) {
            fibonacci[N] = 1;
            return fibonacci[N];
        }
        if (N == 1) {
            fibonacci[N] = fibonacci[N - 1] = 1;
            return fibonacci[N];
        }
        if (fibonacci[N] == null) {
            fibonacci[N] = getFibonacci(N - 1) + getFibonacci(N - 2);
        }
        return fibonacci[N];
    }
}
