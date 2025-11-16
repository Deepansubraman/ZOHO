import java.util.*;
public class Hours {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<>();
        int temp=Integer.MAX_VALUE;
        while(true)
        {
            String str=sc.nextLine();
            
            String st="";
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)!=':')
                st+=str.charAt(i);
            }
            int j=Integer.parseInt(st);
            
            if(j==1)
            { 
                break;
            }
            if(j<temp)
            {
                temp=j;
            }
        }
       
        System.out.println(temp);
    }
}
