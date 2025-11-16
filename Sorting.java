import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int t = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < t; i++) {

            for (int j = i; j < t; j++) {
                if (i % 2 == 0) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                } else {
                    if (arr[i] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < t; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
