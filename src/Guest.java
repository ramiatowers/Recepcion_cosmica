public class Guest {
    // PROPERTIES
    public static int nextId = 1;
    private int id;
    private String name;
    private String surname;
    private int age;
    private boolean confirmation;

    // CONSTRUCTOR
    public Guest(String name, String surname, int age, boolean confirmation) {
        this.id = nextId ++;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.confirmation = confirmation;
    }

    // GETTERS & SETTERS
    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Guest.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    @Override
    public String toString() {
        String coming = confirmation ? "Has confirmed" : "Has cancelled";
        return "Guest: " + id + " " + "|" + " " + "Full Name: " + name + " " + surname + " " + "|" + " " + "Age: " + age + " " + "|" + " " + "Confirmation: " + coming + "\n";
    }
}


