package Section5.괄호문자제거2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        int left = 0; // '('
        int right = 0; // ')'

        StringBuilder answer = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                left++;
            } else if (c == ')') {
                right++;
            } else if (left == right) {
                answer.append(c);
            }
        }
        System.out.println(answer);
    }
}
