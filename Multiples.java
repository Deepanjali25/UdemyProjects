package Udemy;

import java.util.*;

public class Multiples {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.close();
        if (n>=2 || n<=20) {
            for (int i = 1; i < 11; i++) {
                int result=n*i;
                System.out.println(n + " x " + i + " = " + result + "\n");
            }
        }
    }
}
