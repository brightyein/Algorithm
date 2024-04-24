class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] stringArray = my_string.split("");
        
        for(int i = 0; i < stringArray.length; i++) {
            if(stringArray[i].equals(alp)) {
                stringArray[i] = stringArray[i].toUpperCase();
            }
        }
        
        answer = String.join("", stringArray);
        return answer;
    }
}