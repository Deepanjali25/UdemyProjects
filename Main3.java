package Udemy;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");

        boolean hasNextInt = scanner.hasNextInt();

        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        int age = 2019 - yearOfBirth;

        if (age >= 0 && age <= 100) {
            System.out.println("Your name is " + name + " , and you are " + age + " years old.");
        }

        scanner.close();
    }
}