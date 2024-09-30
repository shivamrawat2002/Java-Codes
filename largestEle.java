import java.util.Arrays;

public class largestEle {
    public static void main(String args[])
    {
         int [] arr = {2,3,2,3,4,13,1};
         Arrays.sort(arr);
         System.out.println(arr);
         for(int num:arr)
         {
            System.out.println(num);
         }
    }
}
