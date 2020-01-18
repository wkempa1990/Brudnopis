package Zadania2;

import java.util.Scanner;

public class Wynik {
    public static void main(String[] args) {
        System.out.println("Podaj dlugosc promienia kola");
        Scanner scaner = new Scanner(System.in);
        Kolko kolko = new Kolko(scaner.nextDouble());
        System.out.println("Pole kola = " + kolko.obliczPowierzchnie());
        System.out.println("Podaj dlugosc boku kwadratu");
        Kwadrat kwadrat = new Kwadrat(scaner.nextDouble());
        System.out.println("Pole kawadratu = " + kwadrat.obliczPowierzchnie());
        System.out.println("Podaj dlugosc pierwszego boku ");
        System.out.println("Podaj dlugosc drugiego boku ");
        Prostokat prostokat = new Prostokat(scaner.nextDouble(), scaner.nextDouble());
        System.out.println("Pole Prostokata = " + prostokat.obliczPowierzchnie());
    }
}

