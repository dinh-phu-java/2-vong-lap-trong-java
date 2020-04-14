package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double  soTienVay;
        int soThangVay;
        double tienLaiThang;
        double  tongTien ;
        Scanner in= new Scanner(System.in);
        System.out.print("Nhập số tien vay: ");
        soTienVay=in.nextDouble();
        System.out.print("Nhập số tháng vay: ");
        soThangVay=in.nextInt();
        System.out.print("tỷ lệ lãi 1 tháng: ");
        tienLaiThang=in.nextDouble();


        for (int i =0; i<soThangVay;i++){
            soTienVay=soTienVay + soTienVay*tienLaiThang;

        }

        tongTien=soTienVay;
        System.out.printf("Tổng số nợ phải trả là : %.5f",tongTien);

    }
}
