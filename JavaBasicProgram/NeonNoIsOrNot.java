// Java Program to Check If a Number is Neon number or not

package JavaBasicProgram;

import java.util.Scanner;

public class NeonNoIsOrNot {
    public static boolean isNeon(int n) {
        int squre = n * n;
        int sum = 0;
        while (squre > 0) {
            int r = squre % 10;
            sum += r;
            squre = squre / 10;
        }

        if (sum == n) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        System.out.println("Enter a number to chech wheter is is neon or not");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isNeon(num)) {
            System.out.println(num + " is Neon number");
        } else
            System.out.println(num + " is not a Neon number");
    }
}
