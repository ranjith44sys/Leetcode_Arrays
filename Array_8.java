import java.util.Arrays;
// ------------------------------------------ 167. Two Sum II - Input Array Is Sorted ----------------------------------------

public class Array_8 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        // int[] nums = {2,7,11,15}; 
        nums[1] = 2;
        nums[2] = 7;
        nums[3] = 11;
        nums[4] = 15;
        int target = 9;
        int n = nums.length;
        int[] result = new int[2];
        int start = 1;
        int end = n-1;
        while(start<end)
        {
            int sum =nums[start]+nums[end];
            if(sum == target)
            {
                 result[0]=nums[start];
                 result[1]=nums[end];
                 
            }
            else if(sum>target)
            {
                end--;
            }
            else
            {
                start++;
            }
            
        }
        System.out.println(Arrays.toString(result));
    }

    
}
