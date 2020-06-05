package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");

        String numberInput = scanner.nextLine();
        System.out.println("You entered " + numberInput);

        int numberParsed = Integer.parseInt(numberInput);
        ArrayList<Integer> list=new ArrayList<Integer>();

        Random rand = new Random();
        for (int i = 0; i < numberParsed; i++){
            list.add(rand.nextInt());
        }

        int sum=0;
        int product = 1;
        System.out.println("Here are your random integers:");
        for (int num : list){
            System.out.println(num);
            sum+=num;
            product*=num;
        }
        System.out.println("The sum of your integers is " + sum);
        System.out.println("The product of your integers is " + product);
    }
}
