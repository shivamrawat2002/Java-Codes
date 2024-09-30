import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class decimalToBinary {
    public static void main(String args[])
    {
            int x = 10;
            List<Integer> arr1 = new ArrayList<>();
            while(x>0)
            {
                int r = x%2;
                arr1.add(r);
                x=x/2;
            }
            ListIterator<Integer> list = arr1.listIterator(arr1.size());
            {
                    while(list.hasPrevious())
                    {
                        System.out.print(list.previous());
                    }
            }
    }
}
