import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Zadanie99999 {
    public static void main(String[] args) throws IOException {
        int yy = LocalDate.now().getYear();
        for (int mm=1; mm<13;mm++){
            String miesiac = String.format("%02d", mm);
            Path folder = Paths.get("testMiesiace",yy + "-" + miesiac);
            if (!Files.exists(folder)) {
                Files.createDirectories(folder);
            }
            Path plikKalendarz = folder.resolve(yy + "-" + miesiac+".txt");
            if (!Files.exists(plikKalendarz)) {
                Files.createFile(plikKalendarz);
            }
        }
    }
}
