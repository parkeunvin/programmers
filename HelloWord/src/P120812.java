import java.util.HashMap;

public class P120812 {
    public static void main(String[] args) {
        // HashMap 생성
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int[] array = { 1, 2, 3, 3, 3, 4 };
        int max = array[0];
        int same = 0;

        for (int i=0; i<array.length; i++){
            int num;
            if (map1.containsKey(array[i])){
                num = map1.get(array[i]) + 1;

                System.out.println(i+" 번째 " + map1);

                if(num>map1.get(max)){
                    max=array[i];
                    same=0;
                    System.out.print("i : "+ i +", max1 : " + max + ", num : " + num + ", same : " + same);
                    
                }else if(num==map1.get(max)){
                    same=1;
                    System.out.print("i : "+ i +", max2 : " + max + ", num : " + num + ", same : " + same);
                }

                
                map1.replace(array[i],num);

            }else{
                map1.put(array[i],1);
            }


        }
        // 결과 출력
        System.out.println();
        System.out.println(map1);
        System.out.println(same);
        System.out.println(max);
    }
}
