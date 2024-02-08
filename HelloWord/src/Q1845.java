import java.util.HashMap;

public class Q1845 {
    public static void main(String[] args){
        int[] nums={3,1,2,3};

        System.out.println(solution(nums));
        //solution(nums);



    }

        public static int solution(int[] nums) {
            HashMap<Integer, Integer> phonecatmon = new HashMap<Integer, Integer>();
            int answer = 0;
            int result = 0;
            result = nums.length / 2; 
            //int[] match=new int[result-1];

            for(int i=0; i<nums.length; i ++){
                phonecatmon.put(nums[i], 1);
                if(phonecatmon.size()>=result){
                    answer = result;
                }else{
                    //return phonecatmon.size();
                    answer = phonecatmon.size();
                }

            }
            return answer;
        }
    
    
}
