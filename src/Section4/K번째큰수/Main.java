package Section4.K번째큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int size = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] cards = new int[size];
        st = new StringTokenizer(bf.readLine(), " ");

        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> sum = new HashSet<>();
        int first = 0;
        int second = 1;
        int third = 2;

        while (true) {
            // third가 마지막 인덱스 + 1일때 갱신
            if (third == cards.length && second == cards.length - 2) {
                first++;
                second = first + 1;
                third = second + 1;
            } else if (third == cards.length) {
                second++;
                third = second + 1;
            }
            if (first == cards.length - 2) {
                break;
            }
            sum.add(cards[first] + cards[second] + cards[third]);
            third++;
        }

        if (sum.size() < K) {
            System.out.println(-1);
            return;
        }

        List<Integer> sumList = new ArrayList<>(sum);
        sumList.sort(Collections.reverseOrder());
        System.out.println(sumList.get(K - 1));
    }
}
