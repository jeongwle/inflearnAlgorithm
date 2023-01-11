package Secion1.문자찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        String letter = bf.readLine();
        int count = 0;
        for (char c : input.toCharArray()) {
            if (letter.equalsIgnoreCase(String.valueOf(c))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
