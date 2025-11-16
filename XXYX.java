public class XXYX{
    public static void main(String[] args) {
        String str="XXYYXXY";
        int count=0;
        int count1=0;
        for(char ch:str.toCharArray())
        {
            if(ch=='X')
            {
                count++;
            }
            else
            {
                count1++;
            }
        }
        int d=Math.abs(count-count1);
        int t=Math.max(count,count1);
        System.out.println(t-d);
    }
}