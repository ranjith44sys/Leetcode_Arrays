import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// -----------------------------------------  349. Intersection of Two Arrays --------------------------------------

public class Array_9 {
    
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        List<Integer> list1 = new ArrayList<>();
        // int start1 = 0;
        // int start2 = 0;

        // while(start1<nums1.length && start2<nums2.length)
        // {
        //     if(nums1[start1] == nums2[start2])
        //     {
        //         if(list1.contains(nums1[start1]))
        //         {
        //             start1++;
        //             start2++;
        //         }
        //         else
        //         {
        //            list1.add(nums1[start1]);
        //            start1++;
        //         }
                
        //     }
        //     else if(start2 == (nums2.length)-1)
        //     {
        //         start1++;
        //         start2 = 0;
        //     }
        //     else
        //     {
        //         start2++;
        //     }
        // }

        //  int n = list1.size();
        //  int[] result = new int[n];
        //  for(int i=0;i<n;i++)
        //  {
        //        result[i] = list1.get(i);
        //  }
        //  System.out.println(Arrays.toString(result));

        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1) set1.add(num);
        Set<Integer> set2 = new HashSet<>();
        for(int num: nums2)
        {
            if(set1.contains(num))
            {
                set2.add(num);
            }
        }
        int result[] = new int[set2.size()];
        int i =0;
        for(int num : set2)
        {
            result[i] = num;
            i++;
        }
        System.out.println(Arrays.toString(result));

    }
}
