public class Q120868 {
    
    public static void main(String[] args){
        int[] sides = {3,6};

        //solution(sides);
        System.out.println(solution(sides));
    }


    public static int solution(int[] sides) {
        int answer = 0;
        
            answer=sides[0]+sides[1]-Math.abs(sides[0]-sides[1])-1;
            System.out.println(Math.abs(sides[0]-sides[1]));
            System.out.println(sides[0]+sides[1]);


        return answer;
    }
}
