package Boolean;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A = ");
        int a = sc.nextInt();

        System.out.println(
                (a % 2 == 1) && (a >=100 && a < 1000)
        );
    }
}
