public class nqt1 {
    public static void main(String args[])
    {   int arr[] = {4,5,0,1,9,0,5,0};
    int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                System.out.print(arr[i]);
            }
            
        }
        for(int j=0;j<count;j++)
            {
                  System.out.print("0");
            }
    }
}
