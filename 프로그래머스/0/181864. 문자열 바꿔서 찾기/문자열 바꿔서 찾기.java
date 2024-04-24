class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String[] stringArray = myString.split("");
        
        for(int i = 0; i < stringArray.length; i++) {
            if(stringArray[i].equals("A")) {
                stringArray[i] = "B";
            } else {
                stringArray[i] = "A";
            }
        }
        
        myString = String.join("", stringArray);
        
        boolean contains = myString.contains(pat);
        
        if (contains == true) {
            answer = 1;
        } else if (contains == false) {
            answer = 0;
        }
        
        return answer;
    }
}