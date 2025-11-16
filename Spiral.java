import java.util.*;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
        int n=num;
        int[][] arr = new int[n * 2 - 1][n * 2 - 1];
        int top = 0;
        int right = n * 2 - 1 - 1;
        int left = 0;
        int bottom = n * 2 - 1 - 1;

        while (top <= bottom && right >= left) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = n;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = n;
            }
            right--;

            if (top <= bottom) { 
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = n;
                }
                bottom--;
            }
            if (right >= left) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = n;
                }
                left++;
            }
            n--;

        }

        for (int i = 0; i < num * 2 - 1; i++) {
            for (int j = 0; j < num * 2 - 1; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
