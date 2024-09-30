import java.util.Scanner;

public class searchArray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the numbers");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("The numbers are:");
        for (int i = 0; i < size; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("Enter the number to search");
        int search = in.nextInt();
        boolean found =false;
        for (int i = 0; i < size; i++) 
        {
            if (nums[i] == search) 
            {
                System.out.println("Found");
                System.out.println("The Index is:" + i);
                found =true;
                break;
            } 
        }
        if(!found)
        {
            System.out.println("Not Found");
        }
    }
}
