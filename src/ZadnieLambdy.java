import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ZadnieLambdy {
    public static void main(String[] args) {
        String s = "Jan";
        Consumer<String> konsumer = (c) -> System.out.println("Imie to :" + c);//drukuje c = napis
        konsumer.accept(s);

        ArrayList<String> lista= new ArrayList<>();
       String b = "marek";
       String c = "wojtek";
        Consumer<String> konsumer2 = null;
        konsumer2=(a)-> System.out.println(a);
        lista.add(c);
        lista.add(b);
        konsumer2.accept(b);
        konsumer2.accept(c);





        }
    }

