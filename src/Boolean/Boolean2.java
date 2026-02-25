package Boolean;

import java.util.Scanner;

public class Boolean2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(
                a % 2 == 1
        );

        int b = sc.nextInt();
        System.out.println(
                b % 2 == 0
        );

    }
}
