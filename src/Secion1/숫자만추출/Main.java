package Secion1.숫자만추출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (isNumber(c)) {
                sb.append(c);
            }
        }

        System.out.println(Integer.parseInt(String.valueOf(sb)));
    }

    private static boolean isNumber(char c) {
        return (c >= '0' && c <= '9');
    }
}
