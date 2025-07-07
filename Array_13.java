import java.util.Arrays;

// ----------------------------------------------------- 283. Move Zeroes ---------------------------------------------------

public class Array_13 {
    
    public static void main(String[] args)
    {
        int[] nums = {1,0};
        int start = 0;
        while(start<(nums.length)-1)
        {
            if(nums[start] == 0   )
            {
                if(start != 0 && nums[start-1] == 0 )
                {
                    nums[start-1] = nums[start+1];
                    nums[start+1] = 0;
                    start++;
                }
                else {
                nums[start] = nums[start+1];
                nums[start+1] = 0;
                start++;
                }
                
            }
           
            
        }
        System.out.println(Arrays.toString(nums));
    }
}
