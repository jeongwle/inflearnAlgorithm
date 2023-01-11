package Secion1.중복문자제거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        boolean[] alpha = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!alpha[c - 'a']) {
                alpha[c - 'a'] = true;
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}