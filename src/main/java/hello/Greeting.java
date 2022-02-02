package hello;

public class Greeting {

    public String greetingToJoe (String name){
        if(name.equals("Joe")){
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Greeting g = new Greeting();
        String s = g.greetingToJoe("Béla");

        System.out.println(s);

        String str = g.greetingToJoe("Joe");
        System.out.println(str);
    }
}
