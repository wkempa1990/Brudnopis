package Kurs;

public class DniTygodnia {
    public static void main(String[] args) {
    System.out.println(nazwaDnia(3));
    }

    public static String nazwaDnia(int i) {
        switch (i) {
            case 1:
                return "PONIEDZIALEK";

            case 2:
                return "WTOREK";

            case 3:
                return "SRODA";

            case 4:
                return "CZWARTEK";

            case 5:
                return "PIATEK";

            case 6:
                return "SOBOTA";

            case 7:
                return "NIEDZIELA";

            default:
                return null;
        }
    }


}
