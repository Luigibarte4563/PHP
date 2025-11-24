package Java;

import java.util.Scanner;

class ageChecker {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = s.nextInt();

        if(age >= 18) {
            System.out.println("You are old hehe");
        }else {
            System.out.println("You are a baby hehe");
        }
    }
}