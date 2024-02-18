public class Q181832 {
    public static void main(String[] args){
        solution(4);

    }

        public static int[][] solution(int n) {
            int[][] answer = new int[n][n];
            int row=0;
            int col=0;
            int count = 1;
            String change = "right";

            while (count <= n * n) {
                answer[row][col] = count++;
                
                switch (change) {
                    case "right": 
                        if (col + 1 < n && answer[row][col + 1] == 0) {
                            col++;
                        } else { 
                            change = "down";
                            row++;
                        }
                        break;
                    case "down": 
                        if (row + 1 < n && answer[row + 1][col] == 0) {
                            row++;
                        } else { 
                            change = "left";
                            col--;
                        }
                        break;
                    case "left": 
                        if (col - 1 >= 0 && answer[row][col - 1] == 0) {
                            col--;
                        } else {
                            change = "up";
                            row--;
                        }
                        break;
                    case "up":
                        if (row - 1 >= 0 && answer[row - 1][col] == 0) {
                            row--;
                        } else { 
                            change = "right";
                            col++;
                        }
                        break;
                }
            }

                        for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(answer[i][j] + " ");
                }
                System.out.println();
            }

            return answer;
        }
}
