import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String st=sc.nextLine();
        int count=0;
        int right=0;
        int left=0;
        for(int i=0;i<str.length()-st.length();i++)
        {
            if(str.charAt(i)==st.charAt(0))
            {
                if(str.substring(i,i+4).equals(st))
                count++;
            }
        }
        System.out.println(count);
    }
}