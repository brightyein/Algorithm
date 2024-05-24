import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 총 테스트 케이스 수
        int totalCase = sc.nextInt();

        for (int i = 0; i < totalCase; i++) {
            // 각 테스트 케이스에 대한 계산 수행
            Map<String, Long> clothesMap = inputInfo();
            checkCase(clothesMap);
        }
    }

    // 입력받는 메서드
    public static Map<String, Long> inputInfo() {
        // 의상 갯수
        int clothesCount = sc.nextInt();
        sc.nextLine();

        Map<String, Long> clothesMap = new HashMap<>();

        for (int i = 0; i < clothesCount; i++) {
            // 공백을 기준으로 잘라서 Map 에 담는다
            String[] split = sc.nextLine().split(" ");
            String clothingType = split[1];
            
            // 의상 종류별로 개수 카운트
            clothesMap.put(clothingType, clothesMap.getOrDefault(clothingType, 0L) + 1);
        }
        return clothesMap;
    }

    // 경우의 수 세는 메서드
    public static void checkCase(Map<String, Long> clothesMap) {
        long result = 1;

        // 경우의 수 계산
        for (Long count : clothesMap.values()) {
            result *= (count + 1); // 각 종류마다 해당 의상을 입지 않는 경우 포함
        }

        // 모든 종류의 의상을 하나도 입지 않는 경우 제외
        result -= 1;

        System.out.println(result);
    }
}
