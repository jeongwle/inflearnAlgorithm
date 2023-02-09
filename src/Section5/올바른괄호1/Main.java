package Section5.올바른괄호1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        List<Character> list = new ArrayList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        for (int i = list.size() - 1; i >= 1; i--) {
            if (list.get(i) == ')' && list.get(i - 1) == '(') {
                list.remove(i);
                list.remove(i - 1);
                i = list.size();
            }
        }

        if (list.size() == 0) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
