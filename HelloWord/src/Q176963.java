public class Q176963 {
    

    public static void main(String[] args){
        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {{"may", "kein", "kain", "radi"},
                            {"may", "kein", "brin", "deny"}, 
                            {"kon", "kain", "may", "coni"}};

        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {{"kali", "mari", "don"},
                            {"pony", "tom", "teddy"}, 
                            {"con", "mona", "don"}};

        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning3 = {5, 10, 1, 3};
        String[][] photo3 = {{"may"},
                            {"kein", "deny","may"}, 
                            {"kon", "coni"}};

         solution(name1,yearning1,photo1);
         solution(name2,yearning2,photo2);
         solution(name3,yearning3,photo3);
    }


        public static int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            int num=0;
            while (name.length > num) {
                
                    for(int i=0; i<photo.length; i++){
                        
                        for(int j=0; j<photo[i].length; j++){
                           
                            answer[i] += (name[num]==photo[i][j]) ? yearning[num]:0;
                        }
                    }
               num++;
            }

            for(int i=0; i<answer.length; i++){
                System.out.print(answer[i] + "  ");
            }
            System.out.println();
            return answer;
        }
    



}
