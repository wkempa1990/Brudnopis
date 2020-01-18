package Zadania2;

import java.util.Scanner;

public class Kolko extends Figura {
    public double r;

    public double obliczPowierzchnie() {
        return Math.PI * (r * r);
    }

    public Kolko(double r) {
        this.r = r;
    }
}
