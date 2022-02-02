package hello.statements;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArraysAndLists2 {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(); //ez egy üres lista
        words.add("alma");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); //listához lehet adni új elemet
        numbers.add(2);
        numbers.add(3);
//        numbers.remove(0); //a 0-s indexű elemet törli, kiveszi
//        numbers.clear(); // törli a lista tartalmát - itt jöhet a végén egy hibaüzenet, hogy túllépte a tömb határát

        System.out.println(words); //lista tartalmának kiírása
        System.out.println(numbers);
        System.out.println(numbers.get(1)); // lista x-ik tartalmát adja ki 0-val kezdődik
        System.out.println(numbers.indexOf(3)); //megadja az egyik szám indexértékét
        System.out.println(words.contains("alma")); //tartalmazza-e a lista az adott értéket (true,false)
        System.out.println(words.contains("körte"));
        System.out.println(words.size()); //megkapjuk az adott lista méretét
        System.out.println(numbers.size());

        List<String> word = new ArrayList<>();
        word.add("Béla");
        word.add("Géza");
        word.add("József");
        word.add("Ákos");
        word.add("Andor");

        for (int i = 0; i < word.size(); i++){
            if (word.get(i).length() > 4) { //lekért elem hossza nagyobb mint 4
                System.out.println(word.get(i)); //a lista egyes elemeit kérjük, le de tudjuk az indexét
            }
        }

        for (String s : word) { //for-each ciklus megadjuk milyen típusú listán és melyik listán akarunk végigmenni
            System.out.println(s); //a lista egyes elemeit kérjük le, de nem tudjuk az indexét
        }
        for (String a : word) {
            if (a.length() == 4) { //hosszúság alapján listázza az elemeket
                System.out.println(a);
            }
        }
    }
}
