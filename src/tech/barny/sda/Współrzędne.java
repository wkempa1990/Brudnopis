package tech.barny.sda;

public class Współrzędne {
    private int x;
    private int y;


    public Współrzędne(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Współrzędne) {
            Współrzędne inneWspolrzedne = (Współrzędne) obj;
            return inneWspolrzedne.x == x &&
                    inneWspolrzedne.y == y;
        } else {
            return super.equals(obj);
        }
    }

    public static void main(String[] args) {
        Współrzędne w1 = new Współrzędne(1, 1);
        Współrzędne w2 = new Współrzędne(1, 1);
        System.out.println(w1.equals(w2));
        System.out.println(w1.toString());
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}