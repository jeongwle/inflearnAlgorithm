package Secion1.특정문자뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        char[] input = bf.readLine().toCharArray();
        StringBuilder alpha = new StringBuilder();

        for (char c : input) {
            if (isAlpha(c)) {
                alpha.append(c);
            }
        }

        alpha.reverse();

        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (isAlpha(input[i])) {
                input[i] = alpha.charAt(index);
                index++;
            }
        }
        System.out.println(String.valueOf(input));
    }

    // Character.isAlphabetic(int x) 함수가 있나봄
    private static boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
