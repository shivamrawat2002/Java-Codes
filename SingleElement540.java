public class SingleElement540 {
    public static void main(String args[]) {
        int nums[] = { 1, 1, 2, 3, 3, 4, 4 };
        int low = 0;
        int high = nums.length - 1;
        int mid;
        if (nums[low] != nums[1])

        {
            System.out.println(nums[low]);
        }
        if (nums[high] != nums[high - 1]) {
            System.out.println(nums[high]);
        }
        while (low <= high) {
            mid = low + high - low / 2;
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else {
                high = high - 1;
            }
        }
    }
}
