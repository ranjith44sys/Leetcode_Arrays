package leet_code;

import java.util.Arrays;
import java.util.Collections;

// -------------------------------------------  1299. Replace Elements with Greatest Element on Right Side --------------------------------
public class Array_2 {
    
    public static void main(String[] args) {
        
        int[] array = {17,18,5,4,6,1}; 
        for (int i=0;i<array.length-1;i++)
        {

            for (int j=i+1;j<array.length;j++)
            {

                Arrays.sort(array ,j ,array.length, Collections.reverseOrder());                
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
