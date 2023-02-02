package Section4.매출액의종류;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int size = Integer.parseInt(st.nextToken());
        int days = Integer.parseInt(st.nextToken());

        int[] arr = new int[size];
        st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < days; i++) {
            if (count.containsKey(arr[i])) {
                count.put(arr[i], count.get(arr[i]) + 1);
                continue;
            }
            count.put(arr[i], 1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count.size())
                .append(" ");

        for (int i = 1; i <= arr.length - days; i++) {
            int prev = arr[i - 1];
            int next = arr[i + days - 1];
            count.put(prev, count.get(prev) - 1);
            if (count.get(arr[i - 1]) == 0) {
                count.remove(prev);
            }
            if (count.containsKey(next)) {
                count.put(next, count.get(next) + 1);
            } else {
                count.put(next, 1);
            }
            sb.append(count.size())
                    .append(" ");
        }
        System.out.println(sb);
    }
}
