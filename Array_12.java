
// ---------------------------     202. Happy Number -----------------------------------------------

import java.util.HashSet;
import java.util.*;

public class Array_12 {

    public static void main(String[] args) {
        // int n =19;
        // int n1 = n;
        // int last, rem, sum;
        // boolean result = false; // Initialize with false to avoid compile error

        // while (n1 != 1) {
        //     if (n1 % 10 == 0) {
        //         n1 = 1; // Artificially break early
        //     }

        //     last = n1 % 10;
        //     rem = n1 / 10;
        //     sum = (last * last) + (rem * rem); // Only works correctly for 2-digit numbers

        //     if (sum == 1) {
        //         result = true; // Use assignment, not redeclaration
        //         break;
        //     } else if (last == n1) {
        //         result = false;
        //         break;
        //     } else if (sum == n) {
        //         result = false;
        //         break;
        //     } else {
        //         n1 = sum;
        //     }
        // }

        // System.out.println( (n1 == 1) ? true : result);

        if(ishappy())
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

       
    }

      public static int getsquared(int n1 )
    {
        int digit =0;
        int sum = 0;
        while(n1>0)
        {
         digit = n1%10;
         sum+=digit*digit;
         n1 = n1/10;
        } 
        return sum;
    }

    public static boolean ishappy()
    {
        int n =2;
        int n1 = n ;
        boolean result = false;
        Set<Integer> seen = new HashSet<>();
        while(n1 != 1 && !seen.contains(n1))
        {
            seen.add(n1);
             n1 = getsquared(n1);
        }
        return n1 == 1;
    }
}
