public class Q552288 {
    public static void main(String[] args){
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.print(solution(arr, divisor));
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int a=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[a] +=arr[i];
                a++;
            }
            
        }        
        return answer;
    }
}
