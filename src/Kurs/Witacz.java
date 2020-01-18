package Kurs;

public class Witacz {
    public static void main(String[] args) {
        Welcom("POLISH");
        Welcom("German");
        Welcom("English");
    }

    private static void Welcom(String country) {
        switch (country) {
            case "POLISH":
                System.out.println("Czesc");
                break;
            case "German":
                System.out.println("Hallo");
                break;
            case "English":
                System.out.println("Hi");
                break;
        }
    }


}
