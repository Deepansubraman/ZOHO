import java.util.*;

public class index {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String str1 = sc.nextLine();
        int j = 0;
        int count = 0;
        for (int i = 0; i < str.length();) {
            while (i < str.length() && j < str1.length() && str.charAt(i) == str1.charAt(j)) {
                i++;
                j++;
                count++;
                if (count == str1.length()) {
                    System.out.println("True");
                    return;
                }
            }
            i++;
        }
        System.out.println(count);
        System.out.println("False");
    }
}
