import java.util.Scanner;
public class wheels {
    public static void main(String args[])
    {
         System.out.println("Enter the no os vehicles");
         Scanner input = new Scanner(System.in);
         int v = input.nextInt();
         System.out.println("Enter the no os wheels");
         int w = input.nextInt();
         int fw,tw;
         fw = (w-(2*v))/2;
         tw=(4*v-w)/2;
         System.out.println(fw);
         System.out.println(tw);

    }
}
