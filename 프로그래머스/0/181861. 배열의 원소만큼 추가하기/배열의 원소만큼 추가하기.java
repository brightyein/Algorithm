import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];
        
        int index = 0;
        
        for(int num : arr) {
            for(int j = 0; j < num; j++) {
                answer[index++] = num;
            }
        }
        return answer;
    }
}