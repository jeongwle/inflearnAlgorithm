package Secion1.문자열압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        int count = 0;

        char temp;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            sb.append(temp);
            while (i < input.length() && input.charAt(i) == temp){
                i++;
                count++;
            }
            if (count != 1) {
                sb.append(count);
            }
            i -= 1;
            count = 0;
        }
        System.out.println(sb);
    }
}
