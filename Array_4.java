package leet_code;

// ----------------------------------------- 2956. Find Common Elements Between Two Arrays-------------------------------------------------

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_4
{
       public static void main(String[] args) {
         int[] nums1 ={2,3,2};
         int[] nums2 ={1,2};
         int ans1 = 0;
         int ans2 = 0;
         int[] result= new int[2];
    //     int count2=0;

    //    for(int i=0;i<nums1.length;i++)
    //    {
    //       for(int j=0;j<nums2.length;j++)
    //       {
    //            if(nums1[i]==nums2[j])
    //            {
    //               count1++;
    //               break;
    //            }
    //       }
    //    }

    //    ans1 = count1;
    //    for(int i=0;i<nums2.length;i++)
    //    {
    //       for(int j=0;j<nums1.length;j++)
    //       {
    //            if(nums1[j]==nums2[i])
    //            {
    //               count2++;
    //               break;
    //            }
    //       }
    //    }
    //    ans2 = count2;

    //    System.out.println(ans1+" "+ans2);


    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    for(int num:nums1)
    {
        set1.add(num);
    }
    
    for(int num:nums2)
    {
        if(set1.contains(num))
        {
            ans1++;
        }
    }
       for(int num:nums2)
    {
        set2.add(num);
    }
    
    for(int num:nums1)
    {
        if(set2.contains(num))
        {
            ans2++;
        }
    }

    result[1] = ans1;
    result[0] = ans2;

    System.out.println(Arrays.toString(result));

       }
}