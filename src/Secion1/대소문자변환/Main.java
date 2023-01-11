package Secion1.대소문자변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        char[] toCharArray = input.toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            if (Character.isUpperCase(toCharArray[i])) {
                toCharArray[i] = Character.toLowerCase(toCharArray[i]);
                continue;
            }
            if (Character.isLowerCase(toCharArray[i])) {
                toCharArray[i] = Character.toUpperCase(toCharArray[i]);
            }
        }
        System.out.println(String.valueOf(toCharArray));
    }
}
