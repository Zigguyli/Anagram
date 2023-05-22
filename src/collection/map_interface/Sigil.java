package collection.map_interface;

public class Sigil {
    private String form;
    private String slogan;

    public Sigil(String form, String slogan) {
        this.form = form;
        this.slogan = slogan;
    }

    public String toString() {
        return "form(" + form + ")" +
                ", slogan(" + slogan + ")";
    }
}
