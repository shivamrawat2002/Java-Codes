import java.util.*;
import java.util.Scanner;
public class function1 {
    public static void print_name(String name) {
        System.out.println(name);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        print_name(name);
         
    }
}