package Section5.응급실8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int size = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] patients = new int[size];

        st = new StringTokenizer(bf.readLine(), " ");

        int target = 0;
        int targetIndex = 0;
        for (int i = 0; i < patients.length; i++) {
            patients[i] = Integer.parseInt(st.nextToken());
            if (i == M) {
                target = patients[i];
                targetIndex = i;
            }
        }
        int targetExceedIndex = 0;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] > target) {
                targetExceedIndex = i;
            }
        }

        int result = 0;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] > target) {
                result++;
            } else if (patients[i] == target && i > targetIndex && i > targetExceedIndex) {
                result++;
            }
        }
        // +1은 나의 차례
        System.out.println(result + 1);
    }
}
