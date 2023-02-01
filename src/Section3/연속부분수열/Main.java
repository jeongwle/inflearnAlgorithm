package Section3.연속부분수열;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
//
//        int size = Integer.parseInt(st.nextToken());
//        int targetNumber = Integer.parseInt(st.nextToken());
//
//        int[] arr = new int[size];
//        st = new StringTokenizer(bf.readLine(), " ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int count = 0;
//        int continuous = 1;
//        while (continuous < arr.length) {
//            long sum = 0;
//            for (int i = 0; i < continuous; i++) {
//                sum += arr[i];
//            }
//
//            if (sum == targetNumber) {
//                count++;
//            }
//
//            for (int i = continuous; i < arr.length; i++) {
//                sum += arr[i] - arr[i - continuous];
//                if (sum == targetNumber) {
//                    count++;
//                }
//            }
//            continuous++;
//        }
//        System.out.println(count);
//    }
//
//}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int size = Integer.parseInt(st.nextToken());
        int targetNumber = Integer.parseInt(st.nextToken());

        int[] arr = new int[size];
        st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == targetNumber) {
                    count++;
                }
                if (sum >= targetNumber) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
