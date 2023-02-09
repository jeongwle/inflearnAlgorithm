package Section5.후위식연산4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        Stack<Integer> numberStore = new Stack<>();

        for (char c : input.toCharArray()) {
            if (isOperator(c)) {
                int second = numberStore.pop();
                int first = numberStore.pop();
                int value = operate(first, second, c);

                numberStore.push(value);
                continue;
            }
            numberStore.push(Character.getNumericValue(c));
        }
        System.out.println(numberStore.pop());
    }

    private static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    private static int operate(int first, int second, char oper) {
        switch (oper) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            default:
                return first / second;
        }
    }
}
