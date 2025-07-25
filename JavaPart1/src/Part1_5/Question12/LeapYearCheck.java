package Part1_5.Question12;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        //A year is a leap year if it is divisible by 4.
        //However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
        //Write a program that reads a year from the user and tells whether it is a leap year.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a year: ");
        int year = Integer.valueOf(scanner.nextLine());

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
