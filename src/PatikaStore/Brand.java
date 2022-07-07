package PatikaStore;

public class Brand implements Comparable<Brand> {
    private static int uniqueId = 100;
    private int id;
    private String name;

    public Brand(String name) {
        this.id = uniqueId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.getName());
    }
}
