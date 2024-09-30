import java.util.Scanner;
public class rotateArray189 {
    public static void main(String args[])
    {
        int nums[] = {1,2,3,4,5,6,7};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int k = input.nextInt();
        

    }
    public static void rotateArray(int[]a,int k)
    { 
        k=k%a.length;
       reverse(a, 0, a.length-1);
       reverse(a, 0, k-1);
       reverse(a,k,a.length-1);
    }
    public static void reverse(int[]a , int start,int end)
    {
        while(start<end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
