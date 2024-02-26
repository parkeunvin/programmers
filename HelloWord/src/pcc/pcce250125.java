package pcc;

public class pcce250125 {
    public static void main(String[] args){
        String[][] board={
        {"blue", "red", "orange", "red",}, 
        {"red", "red", "blue", "orange"}, 
        {"blue", "orange", "red", "red"}, 
        {"orange", "orange", "red", "blue"}
        };
        int h = 2;
        int w = 3;

        // System.out.println(board.length);
        // System.out.println(board[0].length);
        int num = solution(board, h, w);

        System.out.println(num);


    }

    public static int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        if ( h != 0 ){
            for (int i = h-1; i<h+2; i+=2){
                //System.out.println(i);
                if(color == board[i][w]){
                    answer+=1;
                }
            }
        }

        if ( w != 0 ){
            for (int i = w-1; i<w+2; i+=2){
                //System.out.println(i);
                if(color == board[h][i]){
                    answer+=1;
                }
            }
        }


        return answer;
    }
}
