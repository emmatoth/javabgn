package product;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Szia! Adja meg a termék nevét!");

        String name = scanner.nextLine();
        System.out.println ("Az általad megadott termék neve: " + name);
        System.out.println ("Add meg ennek a terméknek az árát is!");

        int price = scanner.nextInt();
        System.out.println("Az előző termék ára: " + price);

        Product product = new Product(name,price);
        System.out.println(product.getName());
        System.out.println(product.getPrice());

        product.increasePrice(5000);
        System.out.println("Jövőbeni ára " + product.getPrice());
//        System.out.println(product.getPrice());

        product.decreasePrice(7000);
        System.out.println("Akciós ára " + product.getPrice());
//        System.out.println(product.getPrice());

    }
}
