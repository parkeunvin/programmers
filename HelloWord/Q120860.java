package HelloWord;

import java.util.Arrays;
import java.util.Comparator;

public class Q120860 {
    
    public static void main(String[] args){
        //int[][] dots ={{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] dots ={{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        solution(dots);
        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots) {
        int answer = 0;

        Arrays.sort(dots, Comparator.comparingInt(a -> -(a[0] + a[1])));

        return (dots[0][0]-dots[dots.length-1][0])*(dots[0][1]-dots[dots.length-1][1]);
    }


}
