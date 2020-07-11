package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the number of rows/columns of the two matrices: ");

        int rcOfMatrices = cmd.nextInt();

        int [][] a = new int[rcOfMatrices][rcOfMatrices];
        int [][] b = new int[rcOfMatrices][rcOfMatrices];
        int [][] c = new int[rcOfMatrices][rcOfMatrices];

        for (int row = 0; row < rcOfMatrices; row++){
            for (int column = 0; column < rcOfMatrices; column++){
                a[row][column] = rand.nextInt(10);
                b[row][column] = rand.nextInt(10);
                c[row][column] = 0;
            }
        }

        for (int rowA = 0; rowA < rcOfMatrices; rowA++){
            for (int colB = 0; colB < rcOfMatrices; colB++){
                for (int colA = 0; colA < rcOfMatrices; colA++){
                    c[rowA][colB] += a[rowA][colA] * b[colA][colB];
                }
            }
        }

        System.out.println("Matrix A: ");
        for (int row = 0; row < rcOfMatrices; row++){
            for (int column = 0; column < rcOfMatrices; column++){
                System.out.print(a[row][column]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("Matrix B: ");
        for (int row = 0; row < rcOfMatrices; row++){
            for (int column = 0; column < rcOfMatrices; column++){
                System.out.print(b[row][column]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("Matrix A * B: ");
        for (int row = 0; row < rcOfMatrices; row++){
            for (int column = 0; column < rcOfMatrices; column++){
                System.out.print(c[row][column]+" ");
            }
            System.out.print("\n");
        }
    }
}
