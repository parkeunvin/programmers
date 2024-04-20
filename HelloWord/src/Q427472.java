import java.util.Arrays;

public class Q427472 {
    


    public static int solution(int[] citations) {
    int answer = 0;

    Arrays.sort(citations);
    for (int i = citations.length - 1; i >= 0; i--) {
        if (citations[i] >= citations.length - i) {
            answer = Math.max(answer, citations.length - i);
        } else {
            break;
        }
    }

    return answer;
}

}
