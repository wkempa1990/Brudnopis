public class Generyczna<T> {
    private T zawartosc;

    public Generyczna(T value) {
        this.zawartosc = zawartosc;
    }

    public Generyczna() {

    }

    public T getContent() {
        return zawartosc;
    }

    public void setContent(T zawartosc) {
        this.zawartosc = zawartosc;
    }


}
