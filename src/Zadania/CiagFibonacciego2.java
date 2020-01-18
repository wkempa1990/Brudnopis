package Zadania;

import java.util.Scanner;

public class CiagFibonacciego2 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe ");
        Scanner y = new Scanner(System.in);
        int x = y.nextInt();
        int a = 1;
        int b = 1;
        int c;
        int i = 0;
        do {
            i++;
            c = a;
            a = b;
            b += c;
            System.out.println(a);
        } while (i < x);
    }
}
