package Section3.최대매출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int size = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int[] sales = new int[size];

        st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < sales.length; i++) {
            sales[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < day; i++) {
            sum += sales[i];
        }

        int max = sum;
        for (int i = day; i < sales.length; i++) {
            sum += sales[i] - sales[i - day];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
