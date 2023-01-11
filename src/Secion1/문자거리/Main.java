package Secion1.문자거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        String input = st.nextToken();
        char target = st.nextToken().charAt(0);

        int[] arr = new int[input.length()];
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                index.add(i);
            }
        }

        int prev = Integer.MAX_VALUE;
        int get = 0;
        int next = index.get(get);
        for (int i = 0; i < arr.length; i++) {
            if (i == index.get(get) && get < index.size() - 1) {
                prev = index.get(get);
                get++;
                next = index.get(get);
            }
            arr[i] = Math.min(Math.abs(next - i), Math.abs(prev - i));
        }

        StringBuilder answer = new StringBuilder();

        for (int i : arr) {
            answer.append(i)
                    .append(" ");
        }

        System.out.println(answer);
    }

}
