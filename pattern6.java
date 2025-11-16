import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=0;
        int l=1;
        for(int i=n;i>0;i--)
        {
            k=l;
            for(int j=0;j<i;j++)
            {
                System.out.print(k+"      ");
                k+=(n-j);
            }
            l++;
            System.out.println();
        }
    }
}
