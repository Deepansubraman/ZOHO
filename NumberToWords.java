import java.util.HashMap;
import java.util.*;
public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        String str = "";
        String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        if(num>=100)
        {
            int n=num/100;
            str+=ones[n]+" hundred ";
            num=num%100;
            if(num>0)
            {
                str+="and ";
            }
        }
        if(num>=20)
        {
            int k=num/10;
            str+=tens[k]+" ";
            num=num%10;
        }
        else if(num>=10)
        {
            
            num=num-10;
            str+=teens[num]+" ";
            num=0;
        }
        if(num>0)
        {
              str+=ones[num];
        }
        System.out.println(str);
    }
}
