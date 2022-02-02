package control;

import java.util.Scanner;

public class Control {

    public char getCharacter(char character) {
        switch (character) {
            case 'á':
                return 'a';
            case 'é':
                return 'é';
            case 'í':
                return 'i';
            case 'ó':
            case 'ő':
            case 'ö':
                return 'o';
            case 'ú':
            case 'ű':
            case 'ü':
                return 'u';
            default:
                return character;
        }
    }
//    public static void main(String[] args) {
//        switch ("Á") {
//            case "Á":
//                System.out.println("A");
//            case "É":
//                System.out.println("E");
//            case "Í":
//                System.out.println("I");
//            case "Ó":
//                System.out.println("O");
//            case "Ú":
//                System.out.println("U");

    public static void main(String[] args) {
        Control control = new Control();
        char result = control.getCharacter('g');
        System.out.println(result);
        char result2 = control.getCharacter('ü');
        System.out.println(result2);

        Scanner scanner = new Scanner(System.in); //példányoztatok egy scannert
        String exit = "exit"; //ez fogja eltárolni az input adatot, ez a kezdő érték
        while (!exit.equals("x")) { //meghatározom, hogy az én áltam megadott adat nem egyenlő
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés x billentyű megnyomásával.");
            String response = scanner.nextLine(); //létrehoztunk egy újabb változót, amit a felhasználó beadott - exit = scanner.nextLine(); így is lehet, akkor nem kell az utolsó sor
            exit = response; //értéket adok, annak, amit a felhasználó beadott
        }
    }
}
