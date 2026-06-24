package project;

public class doctor extends person {
    private String specialization;

    public doctor(int id, String name, int contact, String specialization) {
        super(id, name,contact);
        this.specialization = specialization;
    }

    public String getspecialize() {
        return specialization;
    }

    @Override
    public String toString() {
        return "doctor{" +
                "specialization='" + specialization + "'" +
                ", " + super.toString() +
                '}';
    }
}
