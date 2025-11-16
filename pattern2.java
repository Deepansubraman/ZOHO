public class pattern2 {
    public static void main(String[] args)
    {
        String str="PROGRAM";
        int k=0;
        int n=str.length();
            for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == i) {
                System.out.print(str.charAt(i) + " ");
            } else if (j == n - i - 1) {
                System.out.print(str.charAt(n - i - 1) + " ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    }
}
