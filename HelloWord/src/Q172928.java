public class Q172928 {
    public static void main(String[] args){
        String[] park = {"SOO","OXX","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        solution(park, routes);
        //System.out.print(solution(park, routes));
    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        //System.out.println(park[0].substring(0,1));
        int[][] location=new int[park.length][park.length];
        int st_location_X=0;
        int st_location_Y=0;
        for(int i=0; i<park.length; i++){

            for(int j=0; j<park.length; j++){
                switch (park[i].substring(j,j+1)) {
                    case "S":
                        st_location_X=i;
                        st_location_Y=j;
                        break;
                    case "O":
                        location[i][j]=1;
                    break;
                    default:
                        location[i][j]=0;
                        break;
                }
            }
        }
        System.out.println(st_location_X);
        System.out.println(st_location_Y);

        // for(int i=0; i<routes.length; i++){
        //     int spaceIndex = routes[i].indexOf(" ");
        //     switch (routes[i].substring(0)) {
        //         case "N":
        //         st_location_X-=Integer.valueOf(routes[i].substring(spaceIndex + 1));
        //         break;
        //         case "S":
        //         st_location_X+=Integer.valueOf(routes[i].substring(spaceIndex + 1));
        //         break;
        //         case "W":
        //         st_location_Y-=Integer.valueOf(routes[i].substring(spaceIndex + 1));
        //         break;
        //         default:
        //         st_location_Y+=Integer.valueOf(routes[i].substring(spaceIndex + 1));
        //             break;
        //     }
        // }


        // for(int i=0; i<routes.length; i++){

        // }

        return answer;
    }

}
