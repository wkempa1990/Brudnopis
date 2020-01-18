package Zadania2;

import java.util.Scanner;

public class Prostokat extends Figura {
    public double a;
    public double b;

    public double obliczPowierzchnie() {
        return a * b;
    }

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
