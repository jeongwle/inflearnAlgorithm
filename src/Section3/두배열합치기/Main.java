package Section3.두배열합치기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> answer = new ArrayList<>();

        bf.readLine();
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        while (st.hasMoreTokens()) {
            answer.add(Integer.parseInt(st.nextToken()));
        }

        bf.readLine();
        st = new StringTokenizer(bf.readLine(), " ");
        while (st.hasMoreTokens()) {
            answer.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(answer);

        StringBuilder sb = new StringBuilder();
        for (Integer element : answer) {
            sb.append(element)
                    .append(" ");
        }
        System.out.println(sb);
    }
}
