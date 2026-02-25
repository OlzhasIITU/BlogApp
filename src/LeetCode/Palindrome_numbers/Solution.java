package LeetCode.Palindrome_numbers;

import java.util.Scanner;

public class Solution {

    public boolean isPalindrome(int x) {

        if (x < 0) return false;   // negative number is not palindrome numbers;

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;   // соңғы цифр
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution solution1= new Solution();
        System.out.print("X = ");
        int x = sc.nextInt();
        System.out.println(solution1.isPalindrome(x));
    }
}

