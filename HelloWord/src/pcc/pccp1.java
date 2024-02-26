package pcc;

public class pccp1 {
    public static void main(String[] args){
        //시전 시간, 초당 회복량, 추가 회복량
        int[] bandage=new int[]{1,1,1};
        // 체력
        int health=5;
        //공격 시간, 피해량
        int[][] attacks= new int[][]{{1,2},{3,2}};

        int lastAttackTime = attacks[attacks.length - 1][0];
        //시간 
        int sucess=0;
        int num=0;
        int now=health;
        int time = 0;

            while (time <= lastAttackTime) {

            if(attacks[num][0]==time){
                now-=attacks[num][1];
                sucess=0;
                num++;
            }else{
                sucess++;
                 now+=bandage[1];
                if(sucess==bandage[0] ){
                now+=bandage[2];
                sucess=0;
                }
                
                if(now>health){
                    now=health;
                }

            }
            time++;
                
        }
        if(now>=0){

            System.out.println(now);
        }else{
            System.out.println("-1");
        }
    }
}
