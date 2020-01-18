import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Sciezki {
    public static void main(String[] args) throws IOException {
        Path cwdR1 = Paths.get("");
        System.out.println("sciezka: [" + cwdR1 + "]");
        Path cwdAbs = cwdR1.toAbsolutePath();
        System.out.println("sciezka: [" + cwdAbs + "]");
        Path chainedPathR1 = Paths.get("", "src", "main");
        System.out.println(chainedPathR1);
        Path path = Paths.get("src/main/java");
        System.out.println(path);
        Path pathAbs = path.toAbsolutePath();
        System.out.println(pathAbs);
        Path plik = Paths.get("src/main/java").resolve("Mapy.java");
        System.out.println(cwdAbs.getRoot());
        System.out.println(plik.getFileName());
        System.out.println();
        Path testDir = Paths.get("src/Sciezki.java").toAbsolutePath();
        boolean exists = Files.exists(testDir);// czy plik istnieje
        boolean isFile = Files.isRegularFile(testDir);// jest plikiem
        boolean isDirectory = Files.isDirectory(testDir);// jest folderem
        System.out.println(exists);
        System.out.println(isFile);
        System.out.println(isDirectory);
        Path testdir= Paths.get("testdir");//tworzenie folderu + to nizej razem
        Files.createDirectories(testdir);//tworzenie folderu
        Path kolejnyKaalog= testdir.resolve("mama/tata");//tworzenie kolejnych katalogo
        Files.createDirectories(kolejnyKaalog);
        Path plik11 = kolejnyKaalog.resolve("help.txt");//Stworzenie pliku
        Files.createFile(plik11);



    }
}