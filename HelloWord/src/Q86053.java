import java.util.HashMap;

public class Q86053 {
    
    public static void main(String[] args){
        int a = 100;
        int b=10;
        int[] g = {100};
        int[] s= {100};
        int[] w= {7};
        int[] t= {10};
        //solution(sides);
        System.out.println(solution(a,b,g,s,w,t));
    }


    public static long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = -1;
        HashMap<String, Integer> map = new HashMap<>();

        while (a==0 && b==0) {
            int max_w=0;
            int max_t=0;
            //가장 큰 화물량 찾기
            for(int i=0; i<w.length; i++){
                max_w=(max_w<w[i]) ? w[i] : max_w;
                max_t=(max_t<t[i]) ? t[i] : max_t;
            }

        }

        return answer;
    }
}
