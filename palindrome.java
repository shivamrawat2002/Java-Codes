import java.util.Scanner;

public class palindrome {
    public static void main(String args[])
     {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sum=0;
        int rev = x;
        while(x>0)
        {
        int temp = x % 10;
        x = x / 10;
         sum = sum * 10 + temp;
    }
    if(sum==rev)
    {
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
}
}