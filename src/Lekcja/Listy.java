package Lekcja;

import java.util.ArrayList;
import java.util.List;

public class Listy {
    public static void main(String[] args) {
        List<String> imiona = new ArrayList<>();
        imiona.add("mateusz");
        imiona.add("marcin");
        imiona.add("karol");
        imiona.add("wojtek");
        imiona.add("kuba");
        System.out.println(imiona);
        String wojtek = imiona.get(3);
        System.out.println(wojtek);
        imiona.add(2,"marek");
        System.out.println(imiona);
        String karol = imiona.get(3);
        System.out.println(karol);
        int size = imiona.size();
        System.out.println(size);
        imiona.remove(size - 1);
       boolean zawieraKuba =  imiona.contains("kuba");
        System.out.println(zawieraKuba);
      boolean usuneloMarcin=  imiona.remove("marcin");
      System.out.println(usuneloMarcin);
      System.out.println(imiona);
        imiona.set(0,"Egon");
        System.out.println(imiona);
        imiona.addAll(imiona);
        System.out.println(imiona);
    }
}
