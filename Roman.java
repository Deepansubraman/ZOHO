import java.util.*;
public class Roman {
    public static void main(String[] args) {
        String str="VIII";
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            int ch=map.get(str.charAt(i));
            if(i+1<str.length() && map.get(str.charAt(i+1))>ch)
            {
                sum-=ch;
            }
            else
            {
                sum+=ch;
            }
        }
        System.out.println(sum);

        LinkedHashMap<Integer,String>mp=new LinkedHashMap<>();
        mp.put(1000, "M");
        mp.put(900, "CM");
        mp.put(500, "D");
        mp.put(400, "CD");
        mp.put(100, "C");
        mp.put(90, "XC");
        mp.put(50, "L");
        mp.put(40, "XL");
        mp.put(10, "X");
        mp.put(9, "IX");
        mp.put(5, "V");
        mp.put(4, "IV");
        mp.put(1, "I");

        String ans="";
        int g=sum;
        for(Map.Entry<Integer,String>mp1:mp.entrySet())
        {
            while(mp1.getKey()<=g)
            {
                ans+=mp1.getValue();
                g-=mp1.getKey();
            }
        }
        System.out.println(ans);
    }
}
