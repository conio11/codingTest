class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        for (int i = 1; i < 1001; i++) {
            if (i * i == n) {
                cnt += 1;
                answer = 1;
            } 
        }
        
        if (cnt != 1) { 
            answer = 2;
        }
        
        return answer;
    }
}