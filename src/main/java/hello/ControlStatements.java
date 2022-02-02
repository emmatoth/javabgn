package hello;

public class ControlStatements {

    public static void main(String[] args) {
        int x = 4;

        if (x > 2){ //elágazás
            System.out.println("nagyobb kettőnél");
        } else {
            System.out.println("kisebb vagy egyenlő, mint 2");
        }


//        for (int i = 0; i < 3; i++) { //ciklus
//            System.out.println("a");
//        }
        for (int i = 0; i < 3; i++) { //ciklus
            if (i < 2) {
                System.out.println(i);
            } else {
                System.out.println("x");
            }
        }
//    }
//        for (int i = x; x > 2; x--) { //ciklus másképp
//            System.out.println("a");
//        }

        int count = 1;
        while (count < 5) {
            System.out.println("A");
            count++;
        }

        for (int i = 0; i < 3; i++) { //több feltételes if, else
            if (i < 2) {
                System.out.println(i);
            } else if (i < 4) {
                System.out.println("x");
            } else {
                System.out.println("y");
            }
        }

        switch (3) {
            case 1 :
                System.out.println("A");
            case 2:
                System.out.println("B");
            case 3:
                System.out.println("C");
            case 4:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }
    }
}