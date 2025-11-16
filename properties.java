import java.util.*;

public class properties {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int f = 0;
        for (int i = 0; i < arr.length; i++) {
            if(k >= arr[i][0] && k <= arr[i][m-1]) {
                f = i;
                break;
            }
           
        }
        System.out.println(f);
        int l = 0;
        int r = arr[f].length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[f][mid] == k) {
                System.out.println("True");
                return;
            } else if (arr[f][mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println("False");
    }
}

