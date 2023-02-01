package Section3.공통원소구하기;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.StringTokenizer;
//
//public class Main {
//
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        List<Integer> A = new ArrayList<>();
//
//        bf.readLine();
//        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
//        while (st.hasMoreTokens()) {
//            A.add(Integer.parseInt(st.nextToken()));
//        }
//
//        List<Integer> B = new ArrayList<>();
//        bf.readLine();
//        st = new StringTokenizer(bf.readLine(), " ");
//        while (st.hasMoreTokens()) {
//            B.add(Integer.parseInt(st.nextToken()));
//        }
//
//        A.retainAll(B);
//        Collections.sort(A);
//
//        StringBuilder sb = new StringBuilder();
//        for (Integer element : A) {
//            sb.append(element)
//                    .append(" ");
//        }
//        System.out.println(sb);
//    }
//}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int sizeA = Integer.parseInt(bf.readLine());
        int[] A = new int[sizeA];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int sizeB = Integer.parseInt(bf.readLine());
        int[] B = new int[sizeB];

        st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int indexA = 0;
        int indexB = 0;
        StringBuilder sb = new StringBuilder();
        while (indexA < sizeA && indexB < sizeB) {
            if (A[indexA] == B[indexB]) {
                sb.append(A[indexA])
                        .append(" ");
                indexA++;
                indexB++;
            } else if (A[indexA] > B[indexB]) {
                indexB++;
            } else {
                indexA++;
            }
        }
        System.out.println(sb);
    }
}
