package Secion1.암호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        String input = bf.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String password = input.substring(7 * i, 7 * (i + 1));
            sb.append(converter(password.toCharArray()));
        }
        System.out.println(sb);
    }

    private static char converter(char[] password) {
        int result = 0;
        for (int i = 0; i < password.length; i++) {
            if (password[i] == '#') {
                result += Math.pow(2, (password.length - 1) - i);
            }
        }
        return (char) result;
    }

}
