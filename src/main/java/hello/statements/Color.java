package hello.statements;

public enum Color {

    RED("piros"), GREEN("zöld"), BLUE("kék"); //létrehozunk egy olyan osztályt, aminek előre létrehozzuk az összes létrehozható példányát, ebből újabb példányokat már nem lehet

    private String hungarianColour;

    Color(String hungarianColour) { //nincs public módosító, mert ezek az előre definiált példányok
        this.hungarianColour = hungarianColour;
    }

    public String getHungarianColour() {
        return hungarianColour;
    }
}
