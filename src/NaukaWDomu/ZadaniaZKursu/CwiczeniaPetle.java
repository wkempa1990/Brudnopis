package NaukaWDomu.ZadaniaZKursu;

public class CwiczeniaPetle {
    public static void main(String[] args) {
        String[] imiona = {"wojciech", "michal", "bartek", "robet"};
        int i = 0;
        do {
            System.out.println(imiona[i]);
            i++;

        } while (i < imiona.length);

        for (int x = 0; x < imiona.length; x++) {
            System.out.println(imiona[x]);
        }
        for (String z : imiona) { //imiona.for generuje ten rodzaj paetli
            System.out.println(z);
        }
        for (int y =3; y >= 0; --y) {
            System.out.println(imiona[y]);
        }

    }
}
