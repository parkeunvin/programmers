package test;

public class Q581590 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
