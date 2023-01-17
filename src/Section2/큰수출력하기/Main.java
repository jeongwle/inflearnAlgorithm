package Section2.큰수출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        Integer temp = null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (temp == null || temp < number) {
                sb.append(number)
                        .append(" ");
            }
            temp = number;
        }
        System.out.println(sb);
    }
}
