package NaukaWDomu.ZadaniaZKursu;

import java.util.Scanner;

public class CwiczeniaTablice {
    public static void main(String[] args) {
        String[] rok = new String[12];
        rok[0] = "Styczen";
        rok[1] = "Luty";
        rok[2] = "marzec";
        rok[3] = "kwiecien";
        rok[4] = "maj";
        rok[5] = "czerwiec";
        rok[6] = "lipiec";
        rok[7] = "sierpien";
        rok[8] = "wrzesien";
        rok[9] = "pazdziernik";
        rok[10] = "listopad";
        rok[11] = "grudzien";
        for (int i = 0; i < rok.length; i++) {
            System.out.println(rok[i]);
        }
    }
}
