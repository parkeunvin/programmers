public class Q120861 {
    
<<<<<<< HEAD

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

=======
    public static void main(String[] args){
        //String[] keyinput={"left", "right", "up", "right", "right"};
        String[] keyinput={"down", "down", "down", "down", "down"};
        int[] board= {7,9};
        System.out.println(solution(keyinput,board));

    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(int i=0; i<keyinput.length; i++){
            switch (keyinput[i]) {
                case "down":
                    answer[1]-=(Math.abs(answer[1])!=board[1]%2+1) ? 1 : 0;
                break;
                case "up":
                answer[1]+=(Math.abs(answer[1])!=board[1]%2+1) ? 1 : 0;
                break;
                case "right":
                answer[0]+=(Math.abs(answer[1])!=board[0]%2+1) ? 1 : 0;
                break;
                default:
                answer[0]-=(Math.abs(answer[1])!=board[0]%2+1) ? 1 : 0;
                    break;
            }
        }
        System.out.println(answer[0]+ " " + answer[1]);
        return answer;
    }
>>>>>>> 9303a0b36bfeedb1ced4d7683d55ab9850d9a327
}
