package Section2.보이는학생;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int max = Integer.parseInt(st.nextToken());

        int result = 1;
        for (int i = 1; i < N; i++) {
            int height = Integer.parseInt(st.nextToken());
            if (max < height) {
                result++;
            }
            max = Math.max(max, height);
        }
        System.out.println(result);
    }
}
