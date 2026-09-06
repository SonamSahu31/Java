
import java.util.HashMap;
public class TwoSum1 {
    public int[] twoSum(int[] nums , int target){
        //hashmap to store the numbers and their indices
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0; i< nums.length; i++){

            //calculate the complement of the current number
            int complement = target - nums[i];

            //check if the complement is already in the hashmap
            if(map.containsKey(complement)){
                return new int[]{
                    map.get(complement),i
                };
            }
            //if the complement is not in the hashmap, add the current number and its index to the hashmap
            map.put(nums[i], i);


        }
        return new int[]{-1, -1}; //return -1 if no solution is found
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ans = new TwoSum1().twoSum(nums, 9);

        System.out.println(ans[0] + " " + ans[1]);
    }
        
    
}
