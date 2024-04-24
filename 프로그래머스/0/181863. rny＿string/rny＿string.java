class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        String[] stringArray = rny_string.split("");
        
        for(int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("m")) {
                stringArray[i] = "rn";
            }
        }
        
        answer = String.join("", stringArray);
        
        return answer;
    }
}