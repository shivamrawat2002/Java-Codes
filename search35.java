public class search35 {
    public static void main(String args[]) {
        int nums[] = { 1, 3, 4, 5 };
        int low = 0;
        int val = 2;
        int mid;
        int high = nums.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == val) {
                System.out.println(mid);
            }
            else if(nums[low]>val)
            {
                low=mid+1;
            }
            else if(nums[low]<val)
            {
               high=high-1;
            }
            
        }
    }
}