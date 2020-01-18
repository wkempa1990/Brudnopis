package Lekcja;

import java.util.ArrayList;

public class CiagFibonaciegoListy {
    public static void main(String[] args) {
        int n=10;
        ArrayList<Integer> ciagFibon = new ArrayList<>();
        ciagFibon.add(0);
        ciagFibon.add(1);
        for (int k = 2; k < n; k++) {
            ciagFibon.add(ciagFibon.get(k-1)+ciagFibon.get(k-2));
        }
        System.out.println(ciagFibon);
    }
}