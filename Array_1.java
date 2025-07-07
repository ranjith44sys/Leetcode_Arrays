package leet_code;

//----------------------------------------------- Kth Largest Element in an Array--------------------------------

public class Array_1
{
    public static void main(String[] args)
    {
        int[] array = {3,2,1,5,6,4};
        int min = array[0];
        int min_prev = 0 ;
        for (int i=1;i<array.length;i++)
        {
            if(min < array[i])
            {
                min_prev = min;
                min = array[i];
            }
        }
   
    System.out.println(min_prev);

    }

}