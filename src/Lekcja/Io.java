package Lekcja;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Io {

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("src/input.txt");//tekst wyjsciowy
        BufferedReader reader = Files.newBufferedReader(inputPath, StandardCharsets.UTF_8);
        Path outputPath = Paths.get("output.txt");//Tworzenie nowego pliku tekstowe i skopiowanie zawartosci z inpu.txt
        BufferedWriter writer = Files.newBufferedWriter(outputPath);
        char[] cbuf = new char[1024];//znaki mozna podac mniej
        int ilośćOdczytanych = reader.read(cbuf);
        while (ilośćOdczytanych != -1) {// kiedy nie ma juz innych danych funkcja zwraca minus 1,
            writer.write(cbuf, 0, ilośćOdczytanych);//zakres od zera do int ilośćOdczytanych
            ilośćOdczytanych = reader.read(cbuf);
        }
        reader.close();
        writer.close();



        String output = Files.readString(outputPath);
        System.out.println(output);
        List<String> outputLines = Files.readAllLines(outputPath);
        for (String outputLine : outputLines) {
            System.out.println(outputLine);
        }
        byte[] bytes = Files.readAllBytes(outputPath);
        String outputFromBytes = new String(bytes, StandardCharsets.UTF_8);
        Path outputPath2 = Paths.get("output2.txt");
        Files.write(outputPath2, bytes);
        Files.writeString(Paths.get("output3.txt"), "Cześć, jestem Krystian");
        Files.write(Paths.get("output4.txt"), outputLines);

    }


}
