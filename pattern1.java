import java.util.Scanner;
public class pattern1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=2;
        int b=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                if(i%2==0)
                {
                    System.out.print(a);
                    a=a+2;
                }
                else
                {
                    System.out.print(b);
                    b=b+2;
                }
            }
            System.out.println();
        }
    }
}