import java.util.ArrayList;
import java.util.HashMap;

public class Q120812{

    public static void main(String[] args){
        int[] array ={1, 2, 3, 3, 3, 4,4,4};
        int max = 0 ;
        int rtn = -1;
        int a;
        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();

        for (int i=0; i<array.length; i++){
            if (num.containsKey(array[i])) {

                a= num.get(array[i]);
                num.replace(array[i], a + 1);
                if(num.get(array[i])>max){
                    max = num.get(array[i]);
                    rtn = 0 ;
            }else if(num.get(array[i])==max){
                rtn = 1;
            }
        }else {
            num.put(array[i], 1);
        }
    }

     if (rtn == 0){

     }else{
        for(int i : num.keyset()){
            
        }

        }
    
}
