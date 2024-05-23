
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 10;

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        // 배열에 담기
        for (int i = 0; i < 10; i++) {
            list.add((sc.nextInt()) % 42);
        }

        // ArrayList 는 가변배열 이기 때문에 반복문을 돌면서 지우면 문제가 내가 원하는 요소를 지우기 힘들다
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) == list.get(i)) {
                    count -= 1;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
