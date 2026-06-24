package project;

public class person {
    private int id;
    private String name;
    private int contact;
    private int age;

    public person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", age=" + age;
    }
}
