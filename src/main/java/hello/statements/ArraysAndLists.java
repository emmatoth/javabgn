package hello.statements;

import java.util.Arrays;

public class ArraysAndLists {

    public static void main(String[] args) {
        int[] numbers = new int[5];              //ez itt mind a 3 tömböt hoz létre
        int[] numbers2 = new int[]{4, 7, 1, 9, 3};
        int[] numbers3 = {3, 6, 1};

        numbers[1] = 10; // itt megadhatjuk, hogy az egyes tömböknek mi az értéke
        numbers[4] = 34;

        numbers2[3] = 100; //a tömbökön belül ezzel megváltoztatjuk a számát

        System.out.println(numbers2.length);  //hossz lekérdezés
        System.out.println(numbers3[2]); // kiírja az x. indexet - 0-val kezdődik
        System.out.println(Arrays.toString(numbers2)); // a több teljes egészét írja ki, kell az import is
        System.out.println(Arrays.toString(numbers));  //ha nincs megadva, hogy milyen számokból áll, akkor 0-t ír ki

        String[] words = new String[3];
        String[] words2 = new String[]{"alma", "körte", "barack"};
        String[] words3 = {"zebra", "zsiráf"};

        words3[0] = "oroszlán";

        System.out.println(Arrays.toString(words3));

    }
}
