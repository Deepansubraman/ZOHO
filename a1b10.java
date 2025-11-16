import java.util.*;

public class a1b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String re = "";
        char ch = 'A';
        for (int i = 0; i < str.length();) {
            while (i < str.length() && Character.isAlphabetic(str.charAt(i))) {
                
                ch = str.charAt(i);
                i++;
            }

            int num = 0;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {

                int temp = str.charAt(i) - '0';
                num = num * 10 + temp;
                i++;
            }

            for (int j = 0; j < num; j++) {
                re += ch;
            }
        

        }
        System.out.println(re);

    }
}
