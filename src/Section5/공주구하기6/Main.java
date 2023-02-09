package Section5.공주구하기6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int numberOfPrince = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> seat = new ArrayDeque<>();
        for (int i = 1; i <= numberOfPrince; i++) {
            seat.add(i);
        }

        while (seat.size() != 1) {
            int count = 1;
            while (count != K) {
                seat.add(seat.pop());
                count++;
            }
            seat.pop();
        }
        System.out.println(seat.pop());
    }
}
