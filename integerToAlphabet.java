import java.util.*;
public class integerToAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str="";
        while(num>0)
        {
            int n=num%26;
            str+=(char)(n+64);
            num/=26;
        }
        
        String s="";
        for(int i=str.length()-1;i>=0;i--)
        {
            s+=str.charAt(i);
        }
        System.out.println(s);
    }
}
