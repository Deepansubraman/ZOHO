public class form3and4 {
    public static void main(String[] args)
    {
        int j=10;
        System.out.print(3);
        for(int i=1;i<=j;i++)
        {
            int num=i;
            String str="";
            while(num>0)
            {
                
                int rem=num%2;
                if(rem==0)
                {
                    str='3'+str;
                    // System.out.println(str);
                }
                else{
                    str='4'+str;
                    // System.out.println(str);
                }
                num/=2;
            }

            System.out.print(str+",");
            
        }

    }
}
