public class removeElement27 {
    public static void main(String args[])
    {
       int arr[] = {3,2,2,3};
       int val=3;
       int x=0;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]!=val)
        {
           arr[x]=arr[i];
           x++;
        }
       }
    }
}
