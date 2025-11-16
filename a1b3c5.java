public class a1b3c5 {
    public static void main(String[] args) {
        String str="a1c22";
        int num=0;
        String st="";
        String temp="";
        boolean sw=true;
        int h=0;
        for(int i=0;i<str.length();i++)
        { 
            int a=str.charAt(i);
            if(a>=48 && a<=57)
            {
                num=num*10+(a-'0');
                System.out.println(num);
                h++;
                
            }
            if(a>=97 && a<=122)
            {
                temp=""+(char)(a);
                System.out.println(temp);
                h+=100;
                num=0;
                
            }
            if(h%100!=0 && num>0)
            {
                for(int j=0;j<num;j++)
                {
                    st+=temp;
                }
              
                
            }
                
                
        }
        System.out.println(st);
    }
}
