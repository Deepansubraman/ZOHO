import java.util.*;
public class RotateMtrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int left=0;
        int right=arr[0].length-1;
        int top=0;
        int bottom=arr.length-1;
        
        while(left<right && top<bottom)
        {
            int temp=arr[top+1][left];
            for(int i=left;i<=right;i++)
            { 
                int temp1=arr[top][i];
                arr[top][i]=temp;
                temp=temp1;
                
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                int temp1=arr[i][right];
                arr[i][right]=temp;
                temp=temp1;
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                int temp1=arr[bottom][i];
                arr[bottom][i]=temp;
                temp=temp1;
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                int temp1=arr[i][left];
                arr[i][left]=temp;
                temp=temp1;
            }
            left++;
            
            
        }
       for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"     ");
            }
            System.out.println();
        }
    }
     
}
