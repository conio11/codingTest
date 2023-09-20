class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length]; // answer 배열 길이 초기화
        
        for (int i = 0; i < strlist.length; i++) { // .length: 배열의 길이
            answer[i] = strlist[i].length(); // .length(): 문자열의 길이
        }
        
        return answer;
    }
}