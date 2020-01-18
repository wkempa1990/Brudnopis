package NaukaWDomu.ZadaniaZKursu;

public class CwiczeniaPotegi {
    public static void main(String[] args) {
        int[] potegi = new int[20];
        potegi[0] = 1;
        for (int x = 1; x < 20; x++) {
            potegi[x] = potegi[x-1] * 2;
            System.out.println(potegi[x]);
        }
    }
}
