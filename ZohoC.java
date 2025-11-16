import java.util.*;
public class ZohoC{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="WELCOMETOZOHOCORPORATION ";
        String st="TOO";
        
        char[][] arr=new char[5][5];
        int k=0;
        
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=str.charAt(k);
                k++;
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        int[][] dp=new int[6][6];
        
        for(int i=1;i<6;i++)
        {
            for(int j=1;j<6;j++)
            {
                for(int index=0;index<st.length();index++ )
                {
                    if(arr[i-1][j-1]==st.charAt(index))
                    {
                    if(index==0)
                    {
                        dp[i][j]=1;
                    }
                    else
                    {
                        if(dp[i-1][j]==index || dp[i][j-1]==index)
                        {
                            dp[i][j]=index+1;
                        }
                    }
                }
                }
                
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }
        int temp=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(dp[i][j]==1)
                {
                    System.out.println("Starting index:"+(i-1)+" "+(j-1));
                }
                if(  dp[i][j]==st.length())
                {
                    System.out.println("ending index:"+(i-1)+" "+(j-1));
                }

            }
        }
    }
}