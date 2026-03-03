package For_While;

import java.util.Scanner;

// Factorial n! = n * (n-1)
public class Cycle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(factorial(a));
    }

    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

}
