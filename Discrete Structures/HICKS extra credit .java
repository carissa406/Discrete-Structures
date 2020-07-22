package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
	System.out.println("Input a value for x: ");
	Boolean x = myObj.nextBoolean();
	System.out.println("Input a value for y: ");
    Boolean y = myObj.nextBoolean();

    System.out.println("x + y: " + (x || y));
    System.out.println("xy: " + (x && y));
    System.out.println("x xor y: " + (x ^ y));
    System.out.println("x nor y: " + !(x || y));
    System.out.println("x nand y: " + (!x || !y));

    }
}
