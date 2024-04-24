import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder convertedStr = new StringBuilder();
        
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (Character.isUpperCase(c)) { // 대문자라면
                convertedStr.append(Character.toLowerCase(c)); // 소문자로 변경
            } else if (Character.isLowerCase(c)) { // 소문자라면
                convertedStr.append(Character.toUpperCase(c)); // 대문자로 변경
            }
        }

        System.out.println(convertedStr.toString());
    }
}
