/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.time.Year;
import java.util.Scanner;
public class YearRetire {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a = 0;
        int b = 0;
        int year = Year.now().getValue();

        System.out.print("What is your current age? ");
        a = input.nextInt();
        System.out.print("At what age would you like to retire? ");
        b = input.nextInt();
        System.out.println("You have "+(b-a)+" years left until you can retire.");
        System.out.println("It's "+year+", so you can retire in "+(year+(b-a)));
    }
}
