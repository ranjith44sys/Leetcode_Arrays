import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// ---------------------------------------------26. Remove Duplicates from Sorted Array------------------------------------------
public class Array_7 {
    
    public static void main(String[] args) {
        
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<n;i++)
        {
            list.add(nums[i]);
        }
        Set<Integer> list1 = new HashSet<>(list);
        int set_size = list1.size();
        // System.out.println(list1);
        // System.out.println(set_size);
        int index =0;
        for(int num : list1)
        {
            nums[index]= num;
            index++;
        }
        for(int j=n-set_size;j<n;j++)
        {
            nums[j] = -1;
        }

        // System.out.println(Arrays.toString(nums));

    }
}
