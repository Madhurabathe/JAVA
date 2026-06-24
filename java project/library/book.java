package library;

public class book {
    private int id;
    private String name;
    private String category;
    private boolean avail;

    public book(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.avail = avail;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return avail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAvailable(boolean avail) {
        this.avail = avail;
    }

    public void display() {
        System.out.println(id + "" + name + "" + category + "" + (avail ? "Avail" : "Issued"));
    }
}
