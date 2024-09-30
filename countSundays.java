import java.util.HashMap;

public class countSundays {
    public static void main(String args[]) {
        int days = 13;
        System.out.println("Enter the starting day");
        String start = "monday";
        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("monday", 0);
        hmap.put("tuesay ", 1);
        hmap.put("wednesday", 2);
        hmap.put("thrusday", 3);
        hmap.put("friday", 4);
        hmap.put("saturday", 5);
        hmap.put("sunday", 6);
        int count = 0;
        for (int i = 0; i < days; i++) {
            if(hmap.containsKey("monday"))
            {
                
            }

        }
        System.out.println(count);
    }
}
