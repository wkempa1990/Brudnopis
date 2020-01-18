package Zadania2;

import java.util.Scanner;

public class Kwadrat extends Figura {
    public double a;

    public double obliczPowierzchnie() {
        return a * a;
    }

    public Kwadrat(double a) {

        this.a = a;
    }
}
