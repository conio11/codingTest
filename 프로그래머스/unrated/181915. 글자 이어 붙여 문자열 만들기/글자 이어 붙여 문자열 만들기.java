class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for (int i = 0; i < index_list.length; i++) {
            int num = index_list[i];
            answer += my_string.charAt(num); // .charAt(index): 문자열에서 index 번째 값 출력 
        }
        
        return answer;
    }
}