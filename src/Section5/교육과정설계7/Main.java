package Section5.교육과정설계7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        char[] requiredSubject = bf.readLine().toCharArray();
        String subjectPlan = bf.readLine();

        if (requiredSubject.length != 0) {
            int index = subjectPlan.indexOf(String.valueOf(requiredSubject[0]));
            for (int i = 1; i < requiredSubject.length; i++) {
                int next = subjectPlan.indexOf(String.valueOf(requiredSubject[i]));
                if (index == -1 || index > next) {
                    System.out.println("NO");
                    return;
                }
                index = next;
            }
        }
        System.out.println("YES");
    }
}
