package Kurs;

import java.util.Scanner;

public class Scaner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj swoje imie");
        String imie = scanner.nextLine();
        System.out.println(" Twoje imie to:" + imie);
        System.out.println("podaj liczbe");
        String liczba = scanner.nextLine();
        int i = Integer.parseInt(liczba);
        System.out.println(" podaj 2 liczbe");
        String liczba2 = scanner.nextLine();
        int x = Integer.parseInt(liczba2);
        System.out.println(i+x);
    }
}
