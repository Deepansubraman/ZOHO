public class IntegerToString{
    public static void main(String[] args) {
        int s=1;
        System.out.println(s);
        String str=s+"";
        String st=Integer.toString(s);
        System.out.println(st);
        System.out.println(str);
        int s1=Integer.parseInt(str);
    }
}