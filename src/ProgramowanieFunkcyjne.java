import java.util.Scanner;

public class ProgramowanieFunkcyjne { //+ Interfej Funkcyjny
    public static void main(String[] args) {
        System.out.println("Podaj znak + / -");
        String next = new Scanner(System.in).next();
        Funkcyjny operator;
        if (next.equals("+")) {
            operator = (a, b) -> {      // Skrocony operator dodwawnia Funkcyjnego
                return a + b;
            };

        } else if (next.equals("-")) {
            operator = (a, b) -> {
                return a - b;
            };
        } else {
            throw new RuntimeException();
        }
        uruchom(operator);

    }

    public static void uruchom(Funkcyjny operator) { // Uruchomienie programu dodawnia
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int b = scanner.nextInt();
        System.out.println("Wynik to:");
        int i = operator.wykonaj(a, b);
        System.out.println(i);
    }
}
