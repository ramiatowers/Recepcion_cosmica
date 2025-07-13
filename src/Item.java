public class Item {
    // PROPERTIES
    private static int nextId = 1;
    private int id;
    private String description;
    private double weight;
    private boolean delicate;

    // EMPTY CONSTRUCTOR
    public Item() {
        this.id = nextId++;
    }

    // CONSTRUCTOR
    public Item(String description, double weight, boolean delicate) {
        this.id = nextId++;
        this.description = description;
        this.weight = weight;
        this.delicate = delicate;
    }

    // GETTERS & SETTERS

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Item.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isDelicate() {
        return delicate;
    }

    public void setDelicate(boolean delicate) {
        this.delicate = delicate;
    }

    // TO STRING
}


