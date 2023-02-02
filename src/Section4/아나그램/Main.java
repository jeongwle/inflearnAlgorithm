package Section4.아나그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int['z' - 'A' + 1];

        String input = bf.readLine();

        for (char c : input.toCharArray()) {
            count[c - 'A']++;
        }

        input = bf.readLine();

        for (char c : input.toCharArray()) {
            count[c - 'A']--;
        }

        for (int e : count) {
            if (e != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
