package Kurs;

public class HelloWorld {
    public static void main(String[] args) {
        int x = 120;
        int y = 15;
        int suma = x + y;
        System.out.println(suma);
        String txt = "Hello, Wojciech";
        System.out.println(txt);
        int a = 50;
        int b = 10;
        int suma1 = a / b;
        System.out.println(suma1);
        int c = 50;
        int d = 10;
        int suma2 = c * d;
        System.out.println(suma2);
        x = 20;
        y = 10;
        int suma3 = x * y;
        System.out.println(suma3);
        x = 258;
        y = 21;
        boolean podzielone = x % y == 0;
        System.out.println(podzielone);
        x = 20;
        y = 10;
        boolean wieksze = x > y;
        System.out.println(wieksze);
        int e = 15;
        int f = 2;
        int g = 3;
        System.out.println((e % 2 == 0) && (e % g == 0));
        int h = 10;
        int i = (h += 10);
        System.out.println(i);


    }


}
