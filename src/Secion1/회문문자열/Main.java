package Secion1.회문문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();

        if (input.equalsIgnoreCase(String.valueOf(sb))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
