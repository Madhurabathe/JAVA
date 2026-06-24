package project;

public class patient extends person {
    private String disease;

    public patient(int id, String name, int age,String disease) {
        super(id, name, age);
        this.disease = disease;

    }

    public String getdisease() {
        return disease;
    }

    @Override
    public String toString() {
        return "patient{" +
                "disease=" + disease +
                ", " + super.toString() +
                '}';
    }
}