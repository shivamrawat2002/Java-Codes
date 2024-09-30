public class secondLargest
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7};
        
        for(int i=0;i<arr.length-1;i++)
        {   
            arr[i+1] = arr[i];
            System.out.print(arr[i]+" ");
        }
        
    }
}