import java.io.*;
public class SumContiguousSubarray
{
    static int maxSubArraySum(int a[] ,int size)
    {
//        kadane's Algorith:
//        int max_so_far = 0;
//        int max_ending_here = 0;
//        for (int i=0;i<size;i++)
//        {
//            max_ending_here = max_ending_here + a[i];
//            if (max_ending_here <0 )
//            {
//                max_ending_here=0;
//            }
//            else if (max_so_far < max_ending_here)
//            {
//                max_so_far = max_ending_here;
//            }
//        }
//        return max_so_far;

//        optimized way:
        int max_so_far=a[0];
        int cur_max = a[0];

        for (int i=1;i<size;i++) {
            cur_max = Math.max(a[i] , cur_max + a[i]);
            max_so_far = Math.max(max_so_far,cur_max);
        }
        return max_so_far;
    }

    public static void main(String[] args)
    {
        int [] a = {1,2,3,-2,5};
        int size = a.length;

//        SumContiguousSubarray obj = new SumContiguousSubarray(a,size);
        System.out.println(maxSubArraySum(a,size));
    }
}
