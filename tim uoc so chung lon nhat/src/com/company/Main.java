package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = in.nextInt();
        System.out.println("Nhập số b");
        int b= in.nextInt();
        int max;

        if (a>b){
            max =a;
        }else{
            max=b;
        }

        int j=0;
        for (int i =2;i <= max /2 ;i++){
            if(a%i ==0 && b %i ==0){

                j=i;
            }
        }
        System.out.printf("Ước số chung lớn nhất của %d và %d là %d ",a,b,j);
    }
}
