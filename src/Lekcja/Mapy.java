package Lekcja;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Mapy {
    public static void main(String[] args) {
        Map<String,Integer>mapy=new HashMap<>();
        mapy.put("Adam",39);//przypisanie wartosci
        Integer wartoscAdam = mapy.get("Adam");
        System.out.println(wartoscAdam);// wynik to 39 przypisany wartosc  do klucza adama
        Integer wartoscBorys=mapy.get("Borys");
        System.out.println(wartoscBorys);// jesli nie ma przypisanej wartosci do klucza wyjdzie null
        Integer wartoscBorys2=mapy.getOrDefault("Borys",0);//zamiast nulla przypisana wartosc
        System.out.println(wartoscBorys2);

        mapy.put("Adam",30);
        System.out.println(mapy.get("Adam"));// Nadpisanie wartosci podajac ten sam klucz
        mapy.remove("Adam");//Usuwanie
        System.out.println(mapy.containsKey("Adam"));//Sprawdzenie czy zawiera klucz
        mapy.put("Borys",20);
        System.out.println(mapy.containsKey("Borys"));
        mapy.put("Kamil",18);
        Set<Map.Entry<String,Integer>>entries=mapy.entrySet();
        System.out.println(entries);


    }
}
