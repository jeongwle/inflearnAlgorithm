package Section2.멘토링;

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
        int numberOfStudent = Integer.parseInt(st.nextToken());
        int numberOfTest = Integer.parseInt(st.nextToken());

        int[][] grades = new int[numberOfTest][numberOfStudent];

        for (int i = 0; i < grades.length; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        List<Integer> numOfMenteeCandidate = new ArrayList<>();
        // 첫 번째는 addAll 하기 위해 -1 넣어서 -1이 있으면 첫 번째라는 것을 알린다.
        numOfMenteeCandidate.add(-1);
        int result = 0;
        for (int i = 1; i <= numberOfStudent; i++) {
            for (int[] test : grades) {
                boolean now = false;
                List<Integer> temp = new ArrayList<>();
                for (int element : test) {
                    if (now) {
                        temp.add(element);
                    }
                    if (element == i) {
                        now = true;
                    }
                }
                if (numOfMenteeCandidate.contains(-1)) {
                    numOfMenteeCandidate.clear();
                    numOfMenteeCandidate.addAll(temp);
                } else {
                    numOfMenteeCandidate.retainAll(temp);
                }
            }
            result += numOfMenteeCandidate.size();
            numOfMenteeCandidate.clear();
            numOfMenteeCandidate.add(-1);
        }
        System.out.println(result);
    }
}
