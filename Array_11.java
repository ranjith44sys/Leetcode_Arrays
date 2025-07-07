import java.util.Arrays;

// --------------------------------------------- 88. Merge Sorted Array --------------------------------------------------------

public class Array_11 {

    public static void main(String[] args) {
        
       int m = 3;
       int n = 3;
       int[] nums1 = {1,2,3,0,0,0};
       int[] nums2 = {2,5,6};
    //    int start1 = 0;
    //    int start2 = 0;

    //    while(start1 <(m+n)  && start2 < n)
    //    {
    //        if(nums1[start1] < nums2[start2])
    //        {

    //            if(nums1[start1] == 0)
    //            {
    //               nums1[start1] = nums2[start2];
    //               start1++;
    //               start2++;
    //            }
    //            else{   
    //             start1++;
    //         }
    //        }
    //        else if(nums1[start1] == nums2[start2])
    //        {
    //            int temp = nums1[start1+1];
    //            nums1[start1+1] = nums2[start2];
    //            nums2[start2] = temp;
    //            start1++;
    //        }
    //        else
    //        {
    //         int temp = nums1[start1];
    //            nums1[start1] = nums2[start2];
    //            nums2[start2] = temp;
    //            start1++;
    //            start2++;
    //        }
    //    }

    //    System.out.println(Arrays.toString(nums1));


        int i = m - 1;        
        int j = n - 1;       
        int k = m + n - 1;    

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }


    
}

}