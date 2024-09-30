import java.util.*;
public class armStrong {
    public static void armstrongNum(int n)
    {       int sum=0;
            int original = n;
            while(n!=0)
            {
                int rem=n%10;
                n=n/10;
                int cube=rem*rem*rem;
                 sum +=cube;
            }
            if(sum==original)
            {
                System.out.println("Armstrong");
                
            }
            else
            {
                System.out.println("not armstrong");
            }
    }
    public static void main(String[] args) {
        //A number that is equal to the sum of its cubes 153=1+125+27=153
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();
        armstrongNum(n);
    }
}
