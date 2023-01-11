package Secion1.단어뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String input = bf.readLine();

            for (int j = input.length() - 1; j >= 0; j--) {
                sb.append(input.charAt(j));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
