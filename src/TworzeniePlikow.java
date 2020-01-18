import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class TworzeniePlikow {
    public static void main(String[] args) throws IOException {
        Path folder= Paths.get("Foler");
        Files.createDirectories(folder);
        Path kolejnyKaalog1= folder.resolve("2020-01");
        Path kolejnyKaalog2= folder.resolve("2020-02");
        Path kolejnyKaalog3= folder.resolve("2020-03");
        Path kolejnyKaalog4= folder.resolve("2020-04");
        Path kolejnyKaalog5= folder.resolve("2020-05");
        Path kolejnyKaalog6= folder.resolve("2020-06");
        Path kolejnyKaalog7= folder.resolve("2020-07");
        Path kolejnyKaalog8= folder.resolve("2020-08");
        Path kolejnyKaalog9= folder.resolve("2020-09");
        Path kolejnyKaalog10= folder.resolve("2020-10");
        Path kolejnyKaalog11= folder.resolve("2020-11");
        Path kolejnyKaalog12= folder.resolve("2020-12");
        Files.createDirectories(kolejnyKaalog1);
        Files.createDirectories(kolejnyKaalog2);
        Files.createDirectories(kolejnyKaalog3);
        Files.createDirectories(kolejnyKaalog4);
        Files.createDirectories(kolejnyKaalog5);
        Files.createDirectories(kolejnyKaalog6);
        Files.createDirectories(kolejnyKaalog7);
        Files.createDirectories(kolejnyKaalog8);
        Files.createDirectories(kolejnyKaalog9);
        Files.createDirectories(kolejnyKaalog10);
        Files.createDirectories(kolejnyKaalog11);
        Files.createDirectories(kolejnyKaalog12);


    }
}
