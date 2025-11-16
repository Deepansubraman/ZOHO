import java.util.*;

public class SimpleCountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
           String j=i+"";
           count+=j.length();
        }

        System.out.println(count);
    }
}
