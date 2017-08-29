package com.example.common;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month (ex. January): ");
        String month = input.nextLine();


        // Following Code provided by Oracle Java Docs about switch and modified to fit current usage
        ArrayList<String> futureMonths = new ArrayList<String>();

        switch (month) {
            case "January":  futureMonths.add("January");
            case "February":  futureMonths.add("February");
            case "March":  futureMonths.add("March");
            case "April":  futureMonths.add("April");
            case "May":  futureMonths.add("May");
            case "June":  futureMonths.add("June");
            case "July":  futureMonths.add("July");
            case "August":  futureMonths.add("August");
            case "September":  futureMonths.add("September");
            case "October": futureMonths.add("October");
            case "November": futureMonths.add("November");
            case "December": futureMonths.add("December");
                break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }

    }
}


//        In Main ask the user (using Scanner) to choose one of the months (show the month using the English name)
//
//        In an ArrayList add all the months for the given month and all the following months. This can be done many ways but an elegant solution can be coded using a switch statement.
//
//        Show the list to the user.
//
