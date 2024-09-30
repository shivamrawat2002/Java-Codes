public class bubblesort {
    public static void main(String args[])
    {
        int [] nums={1,3,0,22,1,333};
        int i=0;
        int j=i+1;
        boolean flag=false;
        for(i=0;i<nums.length-1;i++)
        {    
            if(nums[i]>nums[j])
            {   flag=true;
                swap(nums, i, j);      
            }
            if(!flag)
            {
                break;
            }
        }
    }
    public static void swap(int []nums,int i,int j)
    {
        int temp;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
