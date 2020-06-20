package com.company;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade:");
        String decimalGrade = scanner.nextLine();

        float floatDecimalGrade = Float.parseFloat(decimalGrade);
        Double roundedDecimalGrade = Math.ceil(floatDecimalGrade);
        int intDecimalGrade = (int) Math.round(roundedDecimalGrade);

        System.out.println("Converted decimal to an integer: " + intDecimalGrade);

        if (intDecimalGrade >= 97) {
            System.out.println("Letter grade: A+");
        } else if (intDecimalGrade >= 93) {
            System.out.println("Letter grade: A");
        } else if (intDecimalGrade >= 90) {
            System.out.println("Letter grade: B+");
        } else if (intDecimalGrade >= 87) {
            System.out.println("Letter grade: B+");
        } else if (intDecimalGrade >= 83) {
            System.out.println("Letter grade: B");
        } else if (intDecimalGrade >= 80) {
            System.out.println("Letter grade: B-");
        } else if (intDecimalGrade >= 77) {
            System.out.println("Letter grade: C+");
        } else if (intDecimalGrade >= 73) {
            System.out.println("Letter grade: C");
        } else if (intDecimalGrade >= 70) {
            System.out.println("Letter grade: C-");
        } else if (intDecimalGrade >= 67) {
            System.out.println("Letter grade: D+");
        } else if (intDecimalGrade >= 63) {
            System.out.println("Letter grade: D");
        } else if (intDecimalGrade >= 60) {
            System.out.println("Letter grade: D-");
        } else {
            System.out.println("Letter grade: F");
        }
    }
}
