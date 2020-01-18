package Lekcja;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class CzytanieBaytow {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(150);
        baos.write(42);
        baos.write(55);
        byte[] bytes = baos.toByteArray();
        System.out.println(Arrays.toString(bytes));
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        int read1 = bais.read();
        System.out.println(read1);
        byte[] bufor = new byte[1024];
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        int read2;
        while ((read2 = bais.read(bufor)) != -1) {
            baos2.write(bufor, 0, read2);
        }
        byte[] wszystkieBajty = baos2.toByteArray();
        System.out.println(Arrays.toString(wszystkieBajty));
        Path path = Paths.get("Miesiace/help.txt");
        Files.deleteIfExists(path);
        OutputStream outputStream = Files.newOutputStream(path);
        outputStream.write(59);
        outputStream.write(60);
        outputStream.write(61);
        outputStream.write(62);
        outputStream.close();
        InputStream inputStream = Files.newInputStream(path);
        byte[] b = new byte[4];

        inputStream.read(b);
        inputStream.close();
        String s = new String(b, StandardCharsets.US_ASCII);
        System.out.println(s);
        System.out.println();
        BufferedReader reader = Files.newBufferedReader(path);
        char[] cbuf = new char[4];
        int ilośćOdczytanych;
        StringBuilder sb = new StringBuilder();
        while ((ilośćOdczytanych = reader.read(cbuf)) != -1) {
            sb.append(cbuf, 0, ilośćOdczytanych);
        }
        String zawartość = sb.toString();
        System.out.println(zawartość);
        reader.close();
    }
}
