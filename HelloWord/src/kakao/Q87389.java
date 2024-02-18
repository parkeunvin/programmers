package kakao;

public class Q87389 {
    public static void main(String[] args){

        solution(12);
    }

    public static int solution(int n) {
        int answer = 0;
        int i=2;
        while(true) {

            if(n % i == 1){
                answer=i;
                System.out.println(answer);
            break;
            }
            i++;
        }

        return answer;
    }
}


