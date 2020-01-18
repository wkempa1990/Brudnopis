import java.util.HashSet;
import java.util.Set;
//Te same skroty co w listach
public class Zbiory {
    public static void main(String[] args) {
        Set<String> ludzie = new HashSet<>();
        ludzie.add("Wojtek");
        ludzie.add("leon");
        ludzie.add("Karolina");
        ludzie.add("Mateusz");
        ludzie.add("Monika");
        ludzie.add("Maciek");

        ludzie.add("Wojtek");//Nie dodaje sie ta sama nazwa
        System.out.println(ludzie);
        for (String osoba : ludzie) {

        }
    }
}
