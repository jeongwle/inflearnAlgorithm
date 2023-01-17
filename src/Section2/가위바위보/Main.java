package Section2.가위바위보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final int SCISSOR = 1;
    private static final int ROCK = 2;
    private static final int PAPER = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] B = new int[N];

        st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                sb.append("D");
            } else if ((A[i] == SCISSOR && B[i] == PAPER) || (A[i] == ROCK && B[i] == SCISSOR) || (
                    A[i] == PAPER && B[i] == ROCK)) {
                sb.append("A");
            } else {
                sb.append("B");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
