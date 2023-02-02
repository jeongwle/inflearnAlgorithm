package Section4.학급회장;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[5];

        bf.readLine();
        String input = bf.readLine();

        for (char c : input.toCharArray()) {
            count[c - 'A']++;
        }

        int result = 'A';
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                index = i;
            }
        }
        System.out.println((char)(result + index));
    }
}


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        Map<Character, Integer> count = new HashMap<>();
//
//        bf.readLine();
//        String input = bf.readLine();
//
//        for (char c : input.toCharArray()) {
//            if (count.containsKey(c)) {
//                count.put(c, count.get(c) + 1);
//                continue;
//            }
//            count.put(c, 1);
//        }
//
//        int max = Integer.MIN_VALUE;
//        char result = 'A';
//        for (Character c : count.keySet()) {
//            Integer value = count.get(c);
//            if (max < value) {
//                max = value;
//                result = c;
//            }
//        }
//        System.out.println(result);
//    }
//}
