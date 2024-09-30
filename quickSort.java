public class quickSort {
    public static void main(String[] args) {
        int []arr = {3,0,15,25,80,20,90,45};
        int pivot = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            for(int j=arr.length-1;j>=0;j++)
            {
                if(arr[i]>pivot && arr[j]<pivot)
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                    
                }
            }
        }
    }
}
