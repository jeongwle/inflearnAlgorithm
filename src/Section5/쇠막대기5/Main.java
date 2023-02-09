package Section5.쇠막대기5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final char LAZER = 'L';

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        StringBuilder modifiedInput = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' && input.charAt(i + 1) == ')') {
                modifiedInput.append(LAZER);
                i++;
                continue;
            }
            modifiedInput.append(input.charAt(i));
        }

        int stick = 0;
        int result = 0;
        for (char c : modifiedInput.toString().toCharArray()) {
            if (c == '(') {
                stick++;
            } else if (c == ')') {
                stick--;
                // 스틱이 끝날 때 한 조각 더 세준다. 예시 : (LAZER)
                // 스틱이 시작되고 레이저를 만났을 때 한 조각 더해주고 끝날 때 한 번 더 더해주면 두 조각 나뉜걸 표현 가능
                result++;
            } else {
                result += stick;
            }
        }
        System.out.println(result);
    }
}
