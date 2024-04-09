import java.util.Arrays;

public class Q42746 {
    
    public static void main(String[] args){
        
        int[] numbers = new int[]{3, 40, 34, 5, 9};
        
        solution(numbers);
    }

    public static String solution(int[] numbers) {
        String answer = "";
        int[] copy = Arrays.copyOfRange(numbers,0,numbers.length);
        //System.out.println(Arrays.toString(copy));
        int num=1;
        while (num!=0) {
            int max=0;
            num=0;
            for(int i=1; i<numbers.length; i++){
                if(numbers[i]%10>numbers[i-1]%10){
                    max=numbers[i-1];
                    numbers[i-1]=numbers[i];
                    numbers[i]=max;
                    num+=1;
                }else if(numbers[i]/10>numbers[i-1]/10){
                    max=numbers[i-1];
                    numbers[i-1]=numbers[i];
                    numbers[i]=max;
                    num+=1;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        // answer=Arrays.toString(numbers);
        // System.out.println(answer);
        return answer;
    }

}
