import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine()); // 재료의 수
        int M = Integer.parseInt(bf.readLine()); // 재료의 합
        int[] A = new int[N]; // 재료들

        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 재료를 배열에 담기
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        // 재료를 오름차순 정렬
        Arrays.sort(A);

        int count = 0;
        int i = 0;
        int j = N-1;

        // 투 포인터 이동으로 순회
        while (i < j) {
            if (A[i] + A[j] < M) {
                i++;
            } else if (A[i] + A[j] == M) {
                count++;
                i++;
                j--;
            } else {
                j--;
            }
        }
        System.out.println(count);
    }
}
