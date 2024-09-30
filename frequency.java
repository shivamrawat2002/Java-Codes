import java.util.Scanner;
public class frequency {
    public static int frequencyCount(int []n,int x)
    {   
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = new int[x];
        for(int i=0;i<n.length-1;i++)
        {
            n[i]=input.nextInt();
        }
        for(int i=0;i<n.length;i++)
        {   int count=0;
            if(n[i]==n[i+1])
            {
                System.out.println(n[i]);
                count++;
            }
            else
            {
                System.out.println(n[i]);
                System.out.print(1);
            }
           
        }
        return 1;

    }
    public static void main(String args[])
    {      Scanner input = new Scanner(System.in);
        int x=input.nextInt();
           int []n = new int[x];
           frequencyCount(n, x);
    }
}
