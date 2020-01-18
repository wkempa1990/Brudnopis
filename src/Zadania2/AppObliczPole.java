package Zadania2;
import java.util.Scanner;
public class AppObliczPole {
    private static Scanner scanner = new Scanner(System.in);    //tu podajemy scaner i nie musismy go wywolywac w kazdej metodzie
    public static void main(String[] args)  {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość figur");
        String inputIleFigur = scanner.nextLine();
        int n = Integer.parseInt(inputIleFigur);
        int[] tablicaFigur = new int[n];
        double[] tablicaPowierzchni = new double[n];
        for (int k = 0; k < n; k++) {
            System.out.println("Podaj rodzaj figury: 1 - koło, 2 - prostokąt, 3 - kwadrat");
            String inputJakaFigura = scanner.nextLine();
            int f = Integer.parseInt(inputJakaFigura);
            tablicaFigur[k] = f;
            switch (tablicaFigur[k]) {
                case 1:
                    tablicaPowierzchni[k] = wczytajKoleczko(tablicaFigur[k]);
                    break;
                case 2:
                    tablicaPowierzchni[k] = wczytajProstokacik(tablicaFigur[k]);
                    break;
                case 3:
                    tablicaPowierzchni[k] = wczytajKwadracik(tablicaFigur[k]);
                    break;
                default:
                    throw new RuntimeException("Miała być figura!");
            }
        }
        double maxPowierzchnia = tablicaPowierzchni[0];
        double minPowierzchnia = tablicaPowierzchni[0];
        int idMax = 0;
        int idMin = 0;
        double sumaPowierzchni = 0;
        for (int k = 0; k < n; k++) {
            sumaPowierzchni = sumaPowierzchni + tablicaPowierzchni[k];
            if (tablicaPowierzchni[k] > maxPowierzchnia) {
                maxPowierzchnia = tablicaPowierzchni[k];
                idMax = k;
            }
            if (tablicaPowierzchni[k] < minPowierzchnia) {
                minPowierzchnia = tablicaPowierzchni[k];
                idMin = k;
            }
        }
        System.out.println("Indesk max: " + idMax + "; Max powierzchnia: " + maxPowierzchnia + "; Rodzaj: " + tablicaFigur[idMax]);
        System.out.println("Indesk min: " + idMin + "; Min powierzchnia: " + minPowierzchnia + "; Rodzaj: " + tablicaFigur[idMin]);
        System.out.println("Srednia powierzchnia wszystkich figur: " + sumaPowierzchni / n);
    }
    public static double wczytajKoleczko(double powierzchnia) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar promienia koła");
        String input = scanner.nextLine();
        int r = Integer.parseInt(input);
        Figura kolko = new Kolko(r);
        powierzchnia = kolko.obliczPowierzchnie();
        return powierzchnia;
    }
    public static double wczytajProstokacik(double powierzchnia) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar pierwszego boku prostokąta");
        String input = scanner.nextLine();
        int a = Integer.parseInt(input);
        System.out.println("Podaj wymiar drugiego boku prostokąta");
        String input2 = scanner.nextLine();
        int b = Integer.parseInt(input2);
        Figura prostokat = new Prostokat(a, b);
        powierzchnia = prostokat.obliczPowierzchnie();
        return powierzchnia;
    }
    public static double wczytajKwadracik(double powierzchnia) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar boku kwadratu");
        String input = scanner.nextLine();
        int a = Integer.parseInt(input);
        Figura kwadrat = new Kwadrat(a);
        powierzchnia = kwadrat.obliczPowierzchnie();
        return powierzchnia;
    }
}
