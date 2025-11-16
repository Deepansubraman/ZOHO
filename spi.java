import java.util.*;
public class spi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        char[][] arr=new char[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]='.';
            }
        }
        int right=m-1;
        int left=0;
        int top=0;
        int bottom=n-1;
        char ch='X';
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i]=ch;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                arr[i][right]=ch;
            }
            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    arr[bottom][i]=ch;
                }
                 bottom--;
            }
           

            if(right>=left)
            {
                for(int i=bottom;i>=top;i--)
                {
                    arr[i][left]=ch;
                }
                left++;
            }

            if(ch=='X')
            ch='O';
            else
            ch='X';

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

}