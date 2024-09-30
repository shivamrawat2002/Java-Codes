public class palindrome2 {
    public static void main(String args[])
    {   int rev=0;
        int x=121;
        int temp=x;
       
        while(x!=0)
        {
            int m = x%10;
            x = x/10;
            rev = (rev*10)+m;
        }   
        if(rev==temp)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        
        
    }
}
