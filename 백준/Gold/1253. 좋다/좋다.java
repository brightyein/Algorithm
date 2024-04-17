import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 수의 개수
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        int result = 0;

        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 배열에 수 넣기
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A); // 배열 오름차순 정렬

        for (int k = 0; k < N; k++) {
            int i = 0;
            int j = N - 1;

            while (i < j) {

                if (i == k) { // i가 k와 같다면, i를 증가
                    i++;
                    continue;
                }
                if (j == k) { // j가 k와 같다면, j를 감소
                    j--;
                    continue;
                }

                if (A[i] + A[j] > A[k]) {
                    j--;
                } else if (A[i] + A[j] < A[k]) {
                    i++;
                } else {
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
