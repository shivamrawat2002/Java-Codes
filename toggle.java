import java.util.*;

public class toggle {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 10;
        while (n > 0) {
            int rem = n % 2;
            list.add(rem);
            n = n / 2;

        }
        ListIterator<Integer> listitr = list.listIterator(list.size());
        while (listitr.hasPrevious()) {
            int bit = listitr.previous();
            if (bit == 0) {
                listitr.set(1);
            } else {
                listitr.set(0);
            }
        }
        System.out.println("Negated bits:");
        ListIterator<Integer> itr = list.listIterator(list.size()); // Start from the end
        while (itr.hasPrevious()) {
            System.out.print(itr.previous());
        }
        int decimal=0;
        int power=0;
        ListIterator<Integer> itr1 = list.listIterator();
        while (itr1.hasNext()) {
           int bit=itr1.next();
           decimal+=(bit*Math.pow(2, power));
           power++;
        }
        System.out.println("The decimnal is:");
        System.out.println(decimal);

    }
}
