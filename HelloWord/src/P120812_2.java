import java.util.HashMap;

public class P120812_2 {
    public static void main(String[] args) {
        

HashMap<Integer, Integer> map1 = new HashMap<>();
        int[] array = {1,1,2,2,3,3,3};
        int max = array[0];
        int same=0;

        for (int i=0; i<array.length; i++){
           int num =map1.getOrDefault(array[i], 0)+1;
           //System.out.println(num);
            if(num> map1.getOrDefault(max, 0)){
                max=array[i];
                same=0;
            }else if(num==map1.get(max)){
                same=1;
            }
            map1.put(array[i],num);
            
        }
        System.out.println(map1);
        System.out.println(same);
        System.out.println(max);




    }
}
