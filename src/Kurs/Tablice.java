package Kurs;

public class Tablice {
    public static void main(String[] args) {
        int[] tablica = new int[6];
        tablica[0] = 2;
        tablica[1] = 5;
        tablica[2] = 8;
        tablica[3] = 9;
        tablica[4] = 12;
        tablica[5] = 21;
        System.out.println(tablica[3]);
        int i = tablica[4];


        String[] dni = new String[]{"poniedzialek", "wtorek", "sroda",
                "czwartek", "piatek", "sobota", "niedziela"};


        int count = 0;
        while (count < dni.length) {
            System.out.println(dni[count]);
            count++;
        }
        System.out.println("Petla zakonczona");

    }
}



