class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;

        if (n == 0) {
            return new int[0]; // 빈 배열 처리
        }

        int[] answer = new int[n + 1]; // 결과 배열 크기를 기존 배열보다 1 크게 설정
        
        if (num_list[n - 1] > num_list[n - 2]) {
            answer[n] = num_list[n - 1] - num_list[n - 2];
        } else {
            answer[n] = num_list[n - 1] * 2;
        }

        // 기존 배열 복사
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}