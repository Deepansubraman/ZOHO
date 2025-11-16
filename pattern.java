public class pattern {
    public static void main(String[] args) {
        // Input string (change as needed)
        String str = "zohoo";

        // Make grid size odd so there's a clear center
        int n;
        if (str.length() % 2 == 0) {
            n = str.length() + 1;
        } else {
            n = str.length();
        }

        // Print grid size (optional)
        System.out.println(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Central row: print characters of the string if available
                if (i == n / 2) {
                    if (j < str.length()) {
                        System.out.print(str.charAt(j) + " ");
                    } else {
                        System.out.print("  "); // keep column alignment
                    }
                }
                // Other rows: print character at index i for the three diagonal/center columns
                else if (j == i || j == n / 2 || j == n - i - 1) {
                    if (i < str.length()) {
                        System.out.print(str.charAt(i) + " ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("  "); // two spaces for alignment with "x " prints
                }
            }
            System.out.println();
        }
    }
}