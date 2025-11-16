public class PermutationCombination {

    public static void main(String[] args) {
        String s = "ABCD";
        printAll(s);
    }

    // Function to print all combinations and permutations
    static void printAll(String s) {
        int n = s.length();

        // For length 1 to n
        for (int r = 1; r <= n; r++) {
            printCombinations("", s, r);
            System.out.println();
        }
    }

    // Generate combinations of length r and permute each combination
    static void printCombinations(String prefix, String remaining, int r) {
        if (r == 0) {
            printPermutations(prefix, "");
            return;
        }
        if (remaining.length() == 0) return;

        // Include the first character
        printCombinations(prefix + remaining.charAt(0), remaining.substring(1), r - 1);

        // Exclude the first character
        printCombinations(prefix, remaining.substring(1), r);
    }

    // Print all permutations of the chosen combination
    static void printPermutations(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.print(prefix + " ");
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            printPermutations(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1)
            );
        }
    }
}
