package hello;

import product.Product;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        //primitív típusú adatok, csak natúr adattárolásra
        int number = 12; //egész számok
        int number1 =12_000_000; //nagy szám esetén van lehetőség így megadni
        int another = (int) 12.3;//konvertálási lehetőség, 12-ként tárolta el (mindig lefele kerekít)
        System.out.println(another);

        double number2 = 3.4; //lebegő pontos számok
        double other = 1; //konvertálási lehetőség, 1.0-ként tárolta el
        System.out.println(other);

        boolean b = true;
        boolean bool = false;
        char c = 'a'; //karaktertípus

        //osztálytípusú, referenciatípusú változók, adatok
        String text = "alma"; //szövegmegjelenítő
        String word = ""; //üres
        String apple = "jonathan" + "" + text + " finom"; //konkatenáció
        boolean boo = text.equals("alma");
        System.out.println(boo);
        boolean bo = text.equals("körte");
        System.out.println(bo);
        System.out.println("alma".length());
        System.out.println("alma".indexOf("a"));
        System.out.println("alma".indexOf("t"));
        System.out.println("almakörte".substring(2));
        System.out.println("almakörte".substring(2, 6));
        System.out.println("alma\nkörte"); //sortörés
        System.out.println("alma" + "\n" + "körte");

        System.out.print("banán"); //ezt a kettő egy sorba fogja megjeleníteni
        System.out.print("dinnye");

        Product product = new Product("kenyér", 500);
        Scanner scanner = new Scanner(System.in);

        //literálok - olyan kifejezések, amelyenek önmagukban is van értelmük (12, 3.4, true...)

        Product anotherProduct = null; //létrehoztam egy változót, de null értéket adtunk neki, nincs olyan objektum, amire mutat
        anotherProduct = product;

        System.out.println(number == another); //ténylegesen egyenlőe?

    }
}
