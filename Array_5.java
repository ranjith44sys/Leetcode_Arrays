
//--------------------------------------------------------------  15. 3Sum ------------------------------------------------------------------


// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// public class Array_5 {
    
//     public static void main(String[] args) {
//         int[] nums = {-1,0,1,2,-1,-4};

//         List<Integer> list1 = new ArrayList<>();
//         List<List<Integer>> result = new ArrayList<>();
       
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=0;j<nums.length;j++)
//             {
//                 for(int k=0;k<nums.length;k++)
//                 {
//                 if(nums[i]+nums[j]+nums[k] == 0)
//                 {
//                     list1.add(nums[i]);
//                     list1.add(nums[j]);
//                     list1.add(nums[k]);
//                     Set<Integer> set = new HashSet<>(list1); 
//                     List<Integer> list2 = new ArrayList<>(set);
//                     result.add(list2);
//                     list1.clear();
                    
                    
//                 }
//                 }
//             }
          
//             }

//         System.out.println(result);
          
//     }
// }

// ---------------------------------------------------------------------------------
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort the array
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;  // Increase sum
                }
                else {
                    right--; // Decrease sum
                }
            }
        }

        return result;
    }
}

