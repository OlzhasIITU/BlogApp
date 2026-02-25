package Boolean;

import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A = ");
        int a = sc.nextInt();

        System.out.println("B = ");
        int b = sc.nextInt();

        System.out.println(
                a >= 0 || b < -2
        );
    }
}
