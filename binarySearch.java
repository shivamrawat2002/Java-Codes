public class binarySearch {
    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int low = 0;
        int high = arr.length - 1;
        int key = 5;
        int mid;
        boolean found = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                found = true;
                System.out.println(mid);
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("element not found");
        }
    }
}
