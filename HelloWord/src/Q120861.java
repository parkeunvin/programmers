public class Q120861 {
    

    public static void main(String[] args){
        String[] keyinput={"left", "right", "up", "right", "right"};
        int[] board={11,11};
        
        solution(keyinput,board);

    }

    public static int[] solution(String[] keyInput, int[] board) {
        int[] now = {0, 0};
        
        for (int i = 0; i < keyInput.length; i++){
            if(keyInput[i].equals("left")) now[0] -= now[0]>-(board[0]/2)?1:0;
            else if(keyInput[i].equals("right")) now[0] += now[0]<(board[0]/2)?1:0;
            else if(keyInput[i].equals("down")) now[1] -= now[1]>-(board[1]/2)?1:0;
            else if(keyInput[i].equals("up")) now[1] += now[1]<(board[1]/2)?1:0;
        
        }
        System.out.print(now[0]);
        System.out.print(" , ");
        System.out.println(now[1]);
        
        return now;
    }

}
