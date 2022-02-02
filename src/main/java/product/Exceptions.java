package product;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

//  1. futtatás
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Adj meg egy számot!");
//        int x = scanner.nextInt();
//        scanner.nextLine();
//    }
//  1. eredmény (Stacktrace a neve)
//        Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:939) - ezt a kivételt ez a metódus dobta el
//        at java.base/java.util.Scanner.next(Scanner.java:1594)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2212) - megmutatja milyen metódusok hivogatták egymást inenn-felfele
//        at product.Exceptions.main(Exceptions.java:10) - ez mutatja meg, hogy hol történt a hiba, a kivétel, product csomag, Exceptions osztály main metódusának 10 sorában

//  2. futtatás
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Adj meg egy számot!");
//        String input = scanner.nextLine();
//        int x = Integer.parseInt(input);
//    }
//  2. eredmény
//        Exception in thread "main" java.lang.NumberFormatException: For input string: "ds"
//        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//        at java.base/java.lang.Integer.parseInt(Integer.java:668)
//        at java.base/java.lang.Integer.parseInt(Integer.java:786)
//        at product.Exceptions.main(Exceptions.java:23) - 23. sorban történt a kivétel

//  3. futtatás
//        String word = null;
//        System.out.println(word.equals("a")); //- null értéken hívok meg változót
//        System.out.println("a".equals(word));
//    }
//  3. eredmény
//        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "word" is null
//        at product.Exceptions.main(Exceptions.java:34)

//  4.futtatás
//        int[] numbers = new int[]{1, 2, 3};
//        for (int i = 0; i <= 3; i++) {
//            System.out.println(numbers[i]);
//        }
//    }
//  4. eredmény
//    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//    at product.Exceptions.main(Exceptions.java:48) - nincs 3. index, mert 0-val kezdődik az indexszámozás

//  5. futtatás
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot!");
        String input = scanner.nextLine();
        try {
            int x = Integer.parseInt(input); //védett rész, ezt futtatjuk
        } catch (NumberFormatException nfe ){ //pontosan olyan típusú hibát akarjuk elkapni, ami keletkezhet, változó deklaráció
            System.out.println("Hiba keletkezett!"); //kivétel kezelő kód, ne legyen üres ilyen esetben
        } catch (Exception ex ){
            System.out.println("Egyéb hiba."); //ezt csak akkor használjuk, ha a többi kivételt nem tudjuk valamiért
        }
    }
//  5. eredmény - sikeresen lefutott, mert raktunk bele hibakezelő ágat, azaz hogy elkapjuk a hibát
//    "C:\Program Files\Java\jdk-17.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=56248:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\T360-v2-JAPA-s06\IdeaProjects\javabgn\target\classes product.Exceptions
//    Adj meg egy számot!
//    r
//    Hiba keletkezett!
//
//    Process finished with exit code 0

}
