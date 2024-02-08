public class Q120846 {
    

    public static void main(String[] args){
        System.out.println(solution(15));

    }

        public static int solution(int n) {
            int answer = 0;
            int num=0;
            for(int i=1; i<=n; i++){
                num=0;
                for(int j=1; j<=i; j++){
                    num +=(i % j ==0) ? 1:0;
                    if (i % j ==0){
                        //System.out.println(i + " : " + j);
                    }
                }
                System.out.println(i + " , " + num);
                answer +=(num>=3)? 1:0;
            }

            return answer;
        }
    
}
