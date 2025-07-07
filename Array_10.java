import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

// ------------------------------------------- 350. Intersection of Two Arrays II ----------------------------------------------------

public class Array_10 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        Map<Integer,Integer> count = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();

        for(int num : nums1)
        {
            count.put(num,count.getOrDefault(num,0)+1);
        }

        for(int num : nums2)
        {
            if(count.containsKey(num) && count.get(num)>0)
            {
                list1.add(num);
                count.put(num,count.get(num)-1);
            }
        }
        int result[] = new int[list1.size()];
        int i=0;
        for(int num : list1)
        {
            result[i] = num;
            i++;
        } 
        System.out.println(Arrays.toString(result));
    }
}
