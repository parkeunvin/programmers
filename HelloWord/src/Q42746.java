import java.util.Arrays;

public class Q42746 {
    public static void main(String[] args){
        
        int[] numbers = new int[]{3, 40, 34, 5, 9};
        
        solution(numbers);
    }

    public static String solution(int[] numbers) {
        String[] temp = new String[numbers.length];
            for(int i=0; i<temp.length; i++){
                temp[i]=String.valueOf(numbers[i]);
            
            }

            Arrays.sort(temp, (a, b) -> (b+a).compareTo(a + b));
            
            StringBuilder answer = new StringBuilder();
            for (String s : temp) {
                answer.append(s);
            }
    
            // 결과가 0으로 시작하는 경우 처리
            if (answer.charAt(0) == '0') {
                return "0";
            }

        System.out.print(answer.toString());

       
        return answer.toString();
    }

}
