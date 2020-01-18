import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZastosowanieLambdy {
    public static void main(String[] args) {
        List<String> imiona = new ArrayList<>(List.of("Adam","piotrek","marek"));
        for(String imie:imiona){
            System.out.println(imiona);
        }
        Consumer<String>a=(x)->System.out.println(x);
        imiona.forEach(a);

        imiona.replaceAll((s)->s.toLowerCase());
        imiona.replaceAll(String::toUpperCase);
        System.out.println(imiona);
        imiona.removeIf((imie)->imie.length()<=4);//usuwa ilosc liter tzn 4 adam 5 marek itp
        System.out.println(imiona);

        Optional<String> optional1 = Optional.empty();
        Optional<String> optional2 = Optional.of("Bob");
        Optional<String> optional3 = Optional.ofNullable(null);
        boolean present = optional1.isPresent();
// boolean empty = optional1.isEmpty();
        String s = optional1.orElse("Other Value");
        String s1 = optional1.orElseGet(() -> "XXX");
// String s2 = optional1.orElseThrow(() -> new RuntimeException());
        Optional<String> o1 = Optional.of("Bob");
        Optional<Integer> l1 = o1.map((imię) -> imię.length());
        System.out.println(o1.isPresent());
// Optional<String> o2 = optional2.map((imię) -> 30 * imię.length());
//System.out.println(optional2.isPresent());
        Optional<String> o2 = Optional.empty();
        o2.map((imię) -> 30 * imię.length());
        System.out.println(o2.isPresent());

        Map<String, String> mapa = new HashMap<>();
        mapa.put("Krzysztof", "Gonciarz");
        String s12 = mapa.get("Krzysztof");
        if (s12 != null) {
            int length = s12.length();
            System.out.println(length);
        }
        Optional<String> nazwisko1 = Optional.ofNullable(mapa.get("Krzysztof"));
        nazwisko1.map((n) -> n.length()).ifPresent(System.out::println);


        List<String> imionaNazwiska = List.of("Grzegorz Martyniuk",
                "Mateusz Spears",
                "Bronisław Piotrzewski"
        );
        imionaNazwiska.forEach(System.out::println);



        Stream<String> strumień = imionaNazwiska.stream();
        Stream<String> strumieńNazwisk = strumień
                .map((imięNazwisko) -> imięNazwisko.split(" ")[1]);
        Stream<Integer> strumieńDługości = strumieńNazwisk
                .map((nazwisko) -> nazwisko.length());
        Stream<Integer> strumieńPrzefiltrowanychDługości = strumieńDługości
                .filter((i) -> i > 7);
        List<Integer> listaDługości = strumieńPrzefiltrowanychDługości
                .collect(Collectors.toList());

        List<Integer> listaDługości1 = imionaNazwiska.stream()
                .map((imięNazwisko) -> imięNazwisko.split(" ")[1])
                .map((nazwisko) -> nazwisko.length())
                .filter((i) -> i > 7)
                .collect(Collectors.toList());

        List<String> imiona1 = List.of("Barnaba Bronisław Son-Goku",
                "Son-Gohan Dalailama Piccolo",
                "Spongebob Kuba Tomek");
        Stream<String> strumieńImion = imiona.stream().flatMap((i) -> {
            String[] rozdzielone = i.split(" ");
            return Arrays.stream(rozdzielone);
        });
        strumieńImion.forEach(System.out::println);


        List<List<String>> listaList = List.of(
                List.of("Barnaba", "Bronisław"),
                List.of(),
                List.of("Grzegorz", "Mateusz", "Ania"),
                List.of("Monika", "Agata", "Antoni"),
                List.of("Macierewicz")
        );
        List<String> listaSpłaszczona = listaList
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(listaSpłaszczona);

    }
}
