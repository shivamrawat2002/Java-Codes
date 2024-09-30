import java.util.*;

public class perfectnum {
    public static void perfectNumber(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        if (sum == x) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not perfect");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        perfectNumber(x);
    }
}
