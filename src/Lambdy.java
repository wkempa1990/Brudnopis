import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdy {


    public static void main(String[] args) {
        Supplier<String> dostawca =()->"Javaaaaaaaa";//drukuje napis
        String s = dostawca.get();
        System.out.println(s);
        Consumer<String> zjadacz = (c)-> System.out.println("\""+c+"\"");//drukuje c = napis
        zjadacz.accept(s);
        Predicate<String> warunek = (x)->x.length()>10;//sprawdza czy dlugosc prawdziwa
        System.out.println(warunek.test(s));
        Function<String,Integer> funkcja = (x)->x.length();//dlugosc wyrazu
        System.out.println(funkcja.apply(s));
    }
}
