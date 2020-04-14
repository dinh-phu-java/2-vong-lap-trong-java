package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle ");
            System.out.println("0. exit");
            System.out.println("nhập lựa chọn:");
            choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i =0 ;i<4 ;i++){
                        for (int j=0;j<7;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i=0;i<6;i++){
                        for (int j=0;j<=i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i=0;i<6;i++){
                        for (int j=6;j>i;j--){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
            }
        }while(choice != 0);


    }
}
