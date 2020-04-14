package com.company;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count =0;
        int i=2;
        do{
            boolean checkNT =true;

            for (int j=2;j<=i/2 ;j++){
                if (i%j ==0){
                    checkNT=false;
                    break;
                }
            }

            if (checkNT){
                count++;
                System.out.printf("Số nguyên tố thứ %d là: %d ", count, i);
                System.out.println();
            }
            i++;
        }while(count <20);
    }



//    public static boolean checkSoNT(int n){
//        boolean check = true;
//        for (int i=0;i<=n/2;i++){
//            if(n%i == 0){
//                check=false;
//                return check;
//            }
//        }
//        return check;
//    }
}
