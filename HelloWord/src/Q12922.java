public class Q12922 {
    
    public static void main(String[] atgs){
    solution(4);
    }

    public static String solution(int n) {
        String answer = "";
        int i=0;
        while (i<n/2) {
            answer+="수박";

            i++;
        }
        if(n%2==1){
            answer+="수";
        }
        System.out.println(answer); 
        return answer;
    }
}
