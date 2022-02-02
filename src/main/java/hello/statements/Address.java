package hello.statements;

import java.util.ArrayList;
import java.util.List;

public class Address {

    private String city;
    private String street;
    private int houseNumber;

    public Address(String city, String street, int houseNumber) { //kontruktor, ez nem objektum
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;


    }

    public static void main(String[] args) {
        List<String> city = new ArrayList<>();
        city.add("Tata");

        System.out.println(city);
    }
}
