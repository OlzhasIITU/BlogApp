package Boolean;

import java.util.Scanner;

public class Boolean15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.println(
                (a % 2 != 1) && (a >= 10 && a < 100)
        );
    }
}
