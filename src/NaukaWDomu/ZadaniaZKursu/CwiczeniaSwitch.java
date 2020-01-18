package NaukaWDomu.ZadaniaZKursu;

import java.util.Scanner;

public class CwiczeniaSwitch {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe od 1 do 12 (1 - styczen , 12- grudzien");
        Scanner name = new Scanner(System.in);
        int liczba = name.nextInt();
        switch (liczba){
            case 1 :
                System.out.println("Styczen");
                break;
            case 2 :
                System.out.println("Luty");
                break;
            case 3 :
                System.out.println("marzec");
                break;
            case 4:
                System.out.println("kwiecien");
                break;
            case 5:
                System.out.println("maj");
                break;
            case 6:
                System.out.println("czerwiec");
                break;
            case 7:
                System.out.println("lipiec");
                break;
            case 8:
                System.out.println("sierpien");
                break;
            case 9:
                System.out.println("wrzesien");
                break;
            case 10:
                System.out.println("pazdziernik");
                break;
            case 11:
                System.out.println("listopad");
                break;
            case 12:
                System.out.println("grudzien");
                break;
            default:
                System.out.println("Bledna liczba");
        }
    }
}
