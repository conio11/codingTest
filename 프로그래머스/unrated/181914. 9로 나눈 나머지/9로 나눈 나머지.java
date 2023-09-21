import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        int answer = 0;
        
        // BigInteger 클래스: long의 범위보다 큰 정수
        BigInteger bigInt = new BigInteger(number);
        BigInteger result = bigInt.mod(BigInteger.valueOf(9)); // mod(): 나머지 계산 메서드
        answer = result.intValue(); // BigInteger 타입을 int로 변환
        
        return answer;
    }
}