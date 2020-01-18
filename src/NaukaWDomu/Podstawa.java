package NaukaWDomu;

public class Podstawa {
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        a += 11;
        a *= 10;
        System.out.println(a);
        String txt = "abcdefghijklmno";
        System.out.println(txt.length());//length liczy dlugosc ciagu "abcdefghijklmno"
        String txt2 = "Wojciech";
        System.out.println(txt2.toUpperCase());// toUpperCase z duzej litery
        String imie = "wojciech";
        String nazwisko = "kempinski";
        String imieInazwisko = (imie + " " + nazwisko);
        System.out.println(imieInazwisko);
        String cudzyslow = "nazwa wlasna \"michal\" mozna zapisac tak";
        System.out.println(cudzyslow);
        Math.max(1000, 2000);
        System.out.println(Math.max(1000, 2000));
        Math.min(3, 22);
        System.out.println(Math.min(3, 22));
        Math.sqrt(81);//sqrt pierwiastek z
        System.out.println(Math.sqrt(81));
        int c = 10;
        int d = 19;
        System.out.println(c > d);
        int dzien = 4;
        switch (dzien) { // int dzien podaje wartosc ze switcha nr 4
            case 1:
                System.out.println("poniedzialek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piatek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;
        }


    }
}
