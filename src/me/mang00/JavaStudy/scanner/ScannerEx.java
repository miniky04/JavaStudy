package me.mang00.JavaStudy.scanner;

import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("input width : ");
        int width = sc.nextInt();
        System.out.print("input height : ");
        int height = sc.nextInt();

        System.out.println("area = " + (width * height));

    }
}