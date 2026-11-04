package geeks;
public class XORofAllSubarrayXORs {
    public int xorOfAllSubarrayXORs(int[] nums) {
        int n = nums.length;

        if(n % 2 == 0){
            return 0;
        }

        int result = 0;
        for(int i=0; i<n; i+=2){
            result ^= nums[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        XORofAllSubarrayXORs solution = new XORofAllSubarrayXORs();
        int[] nums = {1, 2, 3, };
        int result = solution.xorOfAllSubarrayXORs(nums);
        System.out.println("XOR of all subarray XORs: " + result);
    }
        
}

    