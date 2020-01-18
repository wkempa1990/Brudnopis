package NaukaWDomu.ZadaniaZKursu;

public class Zadanie3zKursu {
    public static void main(String[] args) {
        int x = dane(2019,1990,12,11);
        System.out.println(x);
    }

    public static int dane( int a, int b, int c, int d){

        return ((a-b)*12)+ c - d ;
    }
}
