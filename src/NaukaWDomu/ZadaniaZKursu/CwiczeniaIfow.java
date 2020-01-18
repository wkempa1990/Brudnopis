package NaukaWDomu.ZadaniaZKursu;

public class CwiczeniaIfow {
    public static void main(String[] args) {
        int a = 2019;
        int a0 = 1990;
        int b = 12;
        int b0 = 11;
        int wynik = ((a - a0) * 12) + b - b0;
        if (((a - a0) * 12) + b - b0 > 100) {
            System.out.println("Minelo przynajmniej 100 miesiecy =" + " " + wynik);
        } else {
            System.out.println(" Nie minelo 100 miesiecy =" + " " + wynik);
        }
    }
}
