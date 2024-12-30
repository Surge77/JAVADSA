package Problems;

import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {

        //To Check whether the given year is leap year or not

//        Write a program that works out whether if a given year is leap year.A normal
//        year has 365 days, leap year have 366, with an extra day in february.

//        Determining whether a year is a leap year involves checking a few conditions.
//
//        --If the year is evenly divisible by 4, it is a leap year.
//        For example: 1996, 2004, 2008 are leap years because they are divisible by 4.
//        --However, if that year is also divisible by 100, it is not a leap year unless...
//        --The year is divisible by 400. If a year is divisible by 100 but also divisible by 400,then it is a leap year.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println("It is a leap year");
            
        } else if (year%100==0 && year%400==0) {
            System.out.println("It is a leap year");
            
        }else{
            System.out.println("It is not a leap year");
        }

        //Other way of doing
        //A year is considered a leap year
        //1. if (the number is exactly divisible by 4) and (not divisible by 100) or
        //2. if year is divisible by 100
        //then it is a leap year

//        if ((year%100!=0) && (year % 4 == 0) || (year%400==0))  {
//            System.out.println("It is a leap year");
//
//        }else{
//            System.out.println("It is not a leap year");
//        }

    }
}
