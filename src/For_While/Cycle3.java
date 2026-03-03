package For_While;

import java.util.Scanner;

public class Cycle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        for (int i = 1; i < n+1 ; i++) {
            counter = counter * i;
        }
        System.out.println(counter);
    }
}
