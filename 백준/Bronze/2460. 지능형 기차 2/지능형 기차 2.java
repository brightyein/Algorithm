
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> outList = new ArrayList<>();
        List<Integer> inList = new ArrayList<>();

        int[] arr = new int[10];


        for (int i = 0; i < 10; i++) {
            String input = sc.nextLine();
            outList.add(Integer.parseInt(input.split(" ")[0]));
            inList.add(Integer.parseInt(input.split(" ")[1]));
        }

        int start = inList.get(0);
        for (int i = 1; i < 10; i++) {
            start = start - outList.get(i) + inList.get(i);
            arr[i-1] = start;
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}
