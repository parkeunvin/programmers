import java.util.Arrays;

public class Q42748 {

    public static void main(String[] args){
        
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        
        solution(array,commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int j=0;
        for(int i=0; i<commands.length; i++){

            int[] copy = Arrays.copyOfRange(array, commands[j][0]-1, commands[j][1]); 
            Arrays.sort(copy);

            answer[i]=copy[commands[i][2]-1];
            System.out.println(Arrays.toString(copy));
            j+=1;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

}
