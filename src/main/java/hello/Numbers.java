package hello;

public class Numbers {

    public void printEvenNumbers (int number){
        for (int i = 1; i <= number; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public int getOneMore(int number) {
        if (number % 2 == 0) { //számot 2-vel osztva maradékul 0-at kapunk, azaz páros számot
            return number +1;
        } else {
            return number;
        }
    }

    public static void main(String[] args) {
        Numbers n = new Numbers();
        n.printEvenNumbers(14);
    }
}
