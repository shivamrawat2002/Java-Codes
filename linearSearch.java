import java.util.Scanner;

public class linearSearch {
    public static void main(String args[]) {
        int[] arr = { 12, 18, 20, 8, 10 };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to find");
        int x = input.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
           
            if (x == arr[i]) {
                flag = true;
                System.out.println("found");
                break;
            }

        }
        if (!flag) {
            System.out.println("Not found");
        }
    }
}
