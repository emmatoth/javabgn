package product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadAndWriteFile {

    public void readFromFile(Path path) {
        try {
            List<String> namesFromFile = Files.readAllLines(path); //azért van aláhúzva, mert kötelezően kell a kivételt (IOException kezelni, mert ilyen esetekben mindig van kivétel (File műveleteknél van) - ezért ezt kötelező try-catch-be rakni
            for (String s : namesFromFile) {
                System.out.println(("Kedves " + s + "! Örülünk a jelentkezésének."));
            }
        } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file.");
            }
        }

    public static void main(String[] args) {
        ReadAndWriteFile r =new ReadAndWriteFile();
        Path path = Path.of("src/main/resources/names.txt");
        r.readFromFile(path);
    }
}

//Amikor minden rendben:
//        "C:\Program Files\Java\jdk-17.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=56884:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\T360-v2-JAPA-s06\IdeaProjects\javabgn\target\classes product.ReadAndWriteFile
//        Kedves János! Örülünk a jelentkezésének.
//        Kedves Béla! Örülünk a jelentkezésének.
//        Kedves József! Örülünk a jelentkezésének.
//
//        Process finished with exit code 0