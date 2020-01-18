package Lekcja;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class Listy1 {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        LinkedList<String> lista2 = new LinkedList<>();
        List<String> lista= lista1;
        lista = lista2;

        lista.add("A");//dodawanie do listy
        lista.add(0, "B");//przypisanie na dany nr listy
        lista.set(0,"C");//zamiana w danym miejscu listy
        System.out.println(lista);

        lista.addAll(lista);//lista razy dwa
        System.out.println(lista);
        System.out.println(lista.contains("C"));//Sprawdzenie czy lista zawiera dany wyraz znak
        System.out.println(lista.containsAll(lista));// Czy lista zawiera sama w sobie
        lista.remove("C"); // usuwanie danej nazwy z listy
        //lista.remove(5);// usuwanie danego nr z listy
        //lista.removeAll(lista1);//usuwanie calej zawartosci listy
        //System.out.println(lista.get(0));// wywolanie listy
        int size= lista.size();//wielkosc listy
        System.out.println(size);//wywolanie dlugosci listy
        ArrayList<Integer>liczby= new ArrayList<>();
        liczby.add(2);
        liczby.add(3);
        liczby.add(1);
        System.out.println(liczby);
        liczby.sort(null);//sortuje liczby od najmniejszej do najwiekszej
        System.out.println(liczby);
        liczby.sort(Comparator.reverseOrder());//sortuje liczby od najwiekszej
        System.out.println(liczby);
    }
}

