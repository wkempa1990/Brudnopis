import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ZadnieF {
    public static void main(String[] args) {
        Supplier<String> dostawca = () -> "Java";
        Supplier<String> supler = () -> "Python";
        String s = dostawca.get();
        String sp = supler.get();
        // "Java"
        System.out.println(s);
        System.out.println(sp);
        Consumer<String> zjadacz = (c) -> System.out.println("\"" + c + "\"");
        zjadacz.accept(s);
        Consumer<String> argument = (z) -> System.out.println("\"" + z + "\"");
        argument.accept(sp);
        Predicate<String> warunek = (x) -> x.length() > 10;
        System.out.println(warunek.test(s));
        Function<String, Integer> funkcja = (x) -> x.length();
        System.out.println(funkcja.apply(s));
        Function<String, Człowiek> parser = (txt) -> {
            String[] split = txt.split(";");
            String imię = split[0];
            int wiek = Integer.parseInt(split[1]);
            return new Człowiek(imię,wiek);
        };
        Człowiek człowiek = parser.apply("JoachimGąbka;31");
        System.out.println(człowiek.getWiek());
        Function<LocalDate, LocalDateTime> funkcja1 = (x) -> x.atTime(12,0);
        System.out.println(funkcja1.apply(LocalDate.now()));
    }
}
