package Section4.모든아나그램찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Integer> SMap = new HashMap<>();
        Map<Character, Integer> TMap = new HashMap<>();

        String S = bf.readLine();
        String T = bf.readLine();

        for (char c : T.toCharArray()) {
            if (TMap.containsKey(c)) {
                TMap.put(c, TMap.get(c) + 1);
                continue;
            }
            TMap.put(c, 1);
        }

        int section = T.length();

        for (int i = 0; i < section; i++) {
            char c = S.charAt(i);
            if (SMap.containsKey(c)) {
                SMap.put(c, SMap.get(c) + 1);
                continue;
            }
            SMap.put(c, 1);
        }

        int result = 0;
        if (SMap.equals(TMap)) {
            result++;
        }

        for (int i = 1; i <= S.length() - section; i++) {
            char prev = S.charAt(i - 1);
            char next = S.charAt(i + section - 1);
            SMap.put(prev, SMap.get(prev) - 1);
            if (SMap.get(prev) == 0) {
                SMap.remove(prev);
            }
            if (SMap.containsKey(next)) {
                SMap.put(next, SMap.get(next) + 1);
            } else {
                SMap.put(next, 1);
            }
            if (SMap.equals(TMap)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
