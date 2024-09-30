import java.util.Scanner;
import java.util.*;

public class prime {
    public static void primenumber(int n) {
        int count = 0;
        double sqt = Math.sqrt(n);
        for (double i = 2; i <= sqt; i++) 
        {

            if (n % i == 0) {
                count++;
                break;
            }
          
        }
        if(count>=1)
        {
            System.out.println("Not prime");
        }
        else
        {
            System.out.println("prime");
        }

    }

    public static void main(String args[]) {
                  Scanner input = new Scanner(System.in);
                  int n = input.nextInt();
                  primenumber(n);
    }
}
