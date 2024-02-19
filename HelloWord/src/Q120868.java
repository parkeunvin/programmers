public class Q120868 {
    
    public static void main(String[] args){
        int[] sides = {11,7};

        solution(sides);
    }


    public static int solution(int[] sides) {
        int answer = 0;
        int max=0;
        int min=0;

        if(sides[0]>sides[1]){
            max=sides[0];
            min=sides[1];
        }else{
            max=sides[1];
            min=sides[0];
        }

        for(int i=min; i<max)        



        return answer;
    }
}
