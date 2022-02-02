package hello.statements;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> freezer = new ArrayList<>();
        freezer.add("Borsó");
        freezer.add("Bab");
        freezer.add("Csirke");
        freezer.add("Kacsa");
        freezer.add("Spenót");

        System.out.println(freezer);
        System.out.println(freezer.size());

        freezer.remove("Bab");
        freezer.remove("Spenót");

        System.out.println(freezer);
        System.out.println(freezer.size());
    }


}
