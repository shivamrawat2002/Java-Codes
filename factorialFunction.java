import java.util.Scanner;

public class factorialFunction {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));

    }
}
