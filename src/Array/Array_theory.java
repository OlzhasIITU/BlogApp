package Array;

public class Array_theory {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -5, 4, 6, 9, 10, 15, 17, -4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}
