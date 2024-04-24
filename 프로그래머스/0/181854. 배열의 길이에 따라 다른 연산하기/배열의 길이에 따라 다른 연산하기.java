class Solution {
    public int[] solution(int[] arr, int n) {
        // arr의 길이가 홀수인 경우
        if (arr.length % 2 != 0) {
            for (int i = 0; i < arr.length; i += 2) {
                arr[i] = arr[i] + n; // 짝수 인덱스에 n을 더합니다.
            }
        }
        // arr의 길이가 짝수인 경우
        else {
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] = arr[i] + n; // 홀수 인덱스에 n을 더합니다.
            }
        }
        return arr;
    }
}