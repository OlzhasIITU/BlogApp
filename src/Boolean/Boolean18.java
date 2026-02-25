package Boolean;

import java.util.Scanner;

public class Boolean18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A = ");
        int a = sc.nextInt();

        System.out.println("B = ");
        int b = sc.nextInt();

        System.out.println("C = ");
        int c = sc.nextInt();

        System.out.println(
                a == b || a == c || b == c
        );
    }
}
