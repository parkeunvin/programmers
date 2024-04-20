import java.util.Arrays;
import java.util.Collections;
public class Q42747 {
    public static void main(String[] args){
        
        //int[] citations = new int[]{3,0,6,1,5}; //{6,5,3,1,0} 3
        //int[] citations = new int[]{9,7,6,2,1}; //{9,7,6,2,1} 3
        //int[] citations = new int[]{10,8,5,4,3}; //{10,8,5,4,3} 4
        //int[] citations = new int[]{25, 8, 5, 3, 3}; //{25,8,5,3,3} 3
        int[] citations = new int[]{0,0,0,0,0};
        solution(citations);
    }

    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        for(int i=citations.length-1; i>=0; i--){
            if(citations[i]<=citations.length-i){
                if(answer <= citations[i]){
                    answer = citations[i];
                }

                System.out.println(i);
                System.out.println(citations[i]);
                System.out.println(answer);

                return answer;
            }else answer +=1;
        }
        if(citations.length > citations[0]){
            answer=citations[0];
        }else  answer= citations.length;

        System.out.println("NOT");
        System.out.println(answer);
        return answer;
    }

}
