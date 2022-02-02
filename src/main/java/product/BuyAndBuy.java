package product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BuyAndBuy {

    public List<String> readFromFile(Path path) { //beolvas a fájlból
        try {
            List<String> namesFromFile = Files.readAllLines(path);
            return namesFromFile;
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public void writeToFile(Path path) { //létrehoz egy fájlt és beírja a másik fájl tartalmát
        List<String> buying = readFromFile(Path.of("src/main/resources/buying.txt")); //ide azt írjuk ahonnan beolvas
        try {
            buying.add("liszt");
            buying.add("kukorica");
            Files.write(path, buying);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }

    public static void main(String[] args) {
        BuyAndBuy b = new BuyAndBuy();
        Path path = Path.of("src/main/resources/bought.txt"); //ide az adjuk meg, ahova kiír
        b.writeToFile(path);
    }


}
