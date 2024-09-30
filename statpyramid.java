public class statpyramid {
    public static void main(String args[])
    {
        int arr[] = new int[5];
        for(int i=1;i<=arr.length;i++)
        {
          for(int j=arr.length;j>i;j--)
          System.out.print(" ");
          {
            for(int j=1;j<=(2*i)-1;j++)
            {
               System.out.print("*");
            }
          }
          System.out.println("");
        }
    }
}
