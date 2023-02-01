package Section3.최대길이연속부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int size = Integer.parseInt(st.nextToken());
        int changeNumber = Integer.parseInt(st.nextToken());

        int[] arr = new int[size];
        List<Integer> zeroIndex = new ArrayList<>();
        st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) {
                zeroIndex.add(i);
            }
        }

        if (zeroIndex.size() <= changeNumber) {
            System.out.println(arr.length);
            return;
        }

        int max = zeroIndex.get(changeNumber);
        for (int i = changeNumber + 1; i < zeroIndex.size(); i++) {
            max = Math.max(max, zeroIndex.get(i) - zeroIndex.get(i - (changeNumber + 1)) - 1);
            if (i == zeroIndex.size() - 1) {
                max = Math.max(max, arr.length - zeroIndex.get(i - (changeNumber)) - 1);
            }
        }
        System.out.println(max);
    }
}
