package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số N: ");
        int n = in.nextInt();
        boolean check_int=true;
        for (int i=2;i<n/2;i++){
            if(n%i==0){
                check_int=false;
                break;
            }
        }

        if (check_int){
            System.out.printf("số %d nhập vào là số nguyên tố",n);
        }else{
            System.out.printf("số %d nhập vào không là số nguyên tố",n);
        }
    }
}
