
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 숫자들을 넣을 스택 만들기
        Stack<Integer> stack = new Stack<>();

        int result = 0;

        // 0이 아니면 넣고 0이면 최근껄 뺀다
        for (int i = 0; i < N; i++) {

            int num = sc.nextInt();

            if (num != 0) {
                stack.push(num);
            } else if (num == 0) stack.pop();
        }
        for (Integer i : stack) {
            result += i;
        }
        System.out.println(result);
    }
}
