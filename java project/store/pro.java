package store;

public class pro {
    private int id;
    private String name;
    private Double price;

    public pro(int id,String name,Double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public int getId() {
    return id;
}

public String getName() {
    return name;
}

public Double getPrice() {
    return price;
}

@Override
public String toString() {
    return "ID=" + id + ", Name=" + name + ", Price=" + price;
}
}
