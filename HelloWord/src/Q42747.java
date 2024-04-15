import java.util.Arrays;
public class Q42747 {
    public static void main(String[] args){
        
        //int[] citations = new int[]{3,0,6,1,5};
        int[] citations = new int[]{9,7,6,2,1};
        //int[] citations = new int[]{10,8,5,4,3};
        //int[] citations = new int[]{25, 8, 5, 3, 3};
        solution(citations);
    }

    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        for(int i=citations.length-1; i>0; i--){
            if(citations[i]<=citations.length-i){
                answer=citations.length;
                System.out.println(i);
                System.out.println(citations[i]);
                System.out.println(answer);
                return answer;
            }
        }
        System.out.println("NOT");
        return answer;
    }

}
