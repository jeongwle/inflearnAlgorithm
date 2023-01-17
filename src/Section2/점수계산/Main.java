package Section2.점수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        bf.readLine();
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int score = 0;
        int result = 0;
        while (st.hasMoreTokens()) {
            if (isCorrectAnswer(Integer.parseInt(st.nextToken()))) {
                score++;
            } else {
                score = 0;
            }
            result += score;
        }
        System.out.println(result);
    }

    private static boolean isCorrectAnswer(int number) {
        return number == 1;
    }
}
