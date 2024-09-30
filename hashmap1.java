import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hashmap1 {
    public static void main(String args[])
    {   int arr[]={1,2,2,3,3,4};
        HashMap<Integer,Integer>map = new HashMap<>();
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
              if(map.containsKey(arr[i]))
              {
                 map.put(arr[i],map.get(arr[i])+1);
              }
              else{
                map.put(arr[i],1);
              }
              if (map.containsKey(arr[i]) && map.get(arr[i])>max) 
              {
                max = map.get(arr[i]);
              }
        }
        int count=0;
        List<Integer> list = new ArrayList<>(map.values());
        for(int i:list)
        {
            if(i==max)
            {
                count+=i;
            }
        }
        System.out.println(count);
    }
}
