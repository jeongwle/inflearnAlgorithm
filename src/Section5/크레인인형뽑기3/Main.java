package Section5.크레인인형뽑기3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bf.readLine());
        int[][] board = new int[size][size + 1];
        boolean[] empty = new boolean[size + 1];

        for (int i = 0; i < board.length; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            for (int j = 1; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int moveSize = Integer.parseInt(bf.readLine());
        int[] moves = new int[moveSize];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < moves.length; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }
        // 입력 끝

        List<Integer> basket = new ArrayList<>();
        for (int number : moves) {
            if (empty[number]) {
                continue;
            }
            for (int i = 0; i < board.length; i++) {
                if (board[i][number] != 0) {
                    basket.add(board[i][number]);
                    board[i][number] = 0;
                    if (i == board.length - 1) {
                        empty[number] = true;
                    }
                    break;
                }
            }
        }

        int result = 0;
        // 괄호 지우기 처럼
        for (int i = basket.size() - 1; i >= 1; i--) {
            if (Objects.equals(basket.get(i), basket.get(i - 1))) {
                basket.remove(i);
                basket.remove(i - 1);
                result++;
                i = basket.size();
            }
        }
        // 인형은 두개씩 사라지니까
        System.out.println(result * 2);
    }
}
