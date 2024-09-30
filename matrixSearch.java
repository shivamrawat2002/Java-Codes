import java.util.*;

public class matrixSearch {
   
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = input.nextInt();
        System.out.println("Enter the number of Cols");
        int cols = input.nextInt();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println(" ");
        }
        search(mat, input, cols);
    }
    public static void search(int [][]mat,Scanner input,int search)
    {
       System.out.println("enter the element to search");
       search = input.nextInt();
       boolean flag=false;
       for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j <  mat[i].length; j++) {
            if(mat[i][j]==search)
            {   System.out.print("found at row"+i+"coloumn"+j);
                 flag=true;
                 break;
            }
        }
        if(!flag)
        {
            System.out.println("Not found");
        }
    }

    }
}
