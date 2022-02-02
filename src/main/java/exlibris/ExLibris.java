package exlibris;

public class ExLibris {

    private String nameofOwner;

    public ExLibris(String name) {
        this.nameofOwner = name;
    }

    public String getNameofOwner() {
        return nameofOwner;
    }

    public static void main(String[] args) {
        ExLibris stamp = new ExLibris("Kiss József");

        System.out.println(stamp.getNameofOwner());
    }
}
