package Section3.연속된자연수의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bf.readLine());

        int count = 0;
        // 설명하기 어려움. 49 = 24 + 25. 50 = 불가능. 아무튼 절반부터 시작하는게 맞음..
        for (int i = number / 2; i >= 1; i--) {
            int n = 2;
            while (true) {
                // 등차수열의 합
                int sum = n * (2 * i + (n - 1)) / 2;
                if (sum == number) {
                    count++;
                }
                if (sum >= number) {
                    break;
                }
                n++;
            }
        }
        System.out.println(count);
    }
}
