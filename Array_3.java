package leet_code;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

// --------------------------------------------- 152. Maximum Product Subarray------------------------------------------------------

public class Array_3 {

    public static void main(String[] args) {
        int[] array = {2};
        ArrayList<Integer> array2 = new ArrayList<>();
        int result = 1;
        for (int i=0;i<array.length;i++)
        {
            if(array[i] !=0 && array[i] > 0)
            {
                result = result*array[i];
            }
            else if(array[i]!=0 && array[0]>0)
            {
                array2.add(result);
                result = 1;
            }
            else if(array[i]<0)
            {
                array2.add(array[i]);
            }
            else
            {
                array2.add(0);
            }
        }
        Collections.sort(array2);
        System.out.println(array2.get(array2.size()-1));
     }
    
}
//---------------------------------------- leetcode ----------------------------------------
// class Solution {
//     public int maxProduct(int[] nums) {
        
//          ArrayList<Integer> array2 = new ArrayList<>();
//         int result = 1;
//         for (int i=0;i<nums.length;i++)
//         {
//             if(nums[i] !=0 && nums[i] > 0)
//             {
//                 result = result*nums[i];
//             }
//             else if(nums[i]!=0 && nums[0]>0)
//             {
//                 array2.add(result);
//                 result = 1;
//             }
//             else
//             {
//                 array2.add(0);
//             }
//         }
//         Collections.sort(array2);
//         return  (array2.get(array2.size()-1));
//     }
// }
