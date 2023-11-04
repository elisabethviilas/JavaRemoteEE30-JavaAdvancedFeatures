package aggregation;

// Aggregation occurs when there is a one-way relationship (HAS-A) between two classes we associate (relate) through their object
// In below example, we can say every student HAS-A bunch of notebooks.

public class Student {
    private String name;
    private double weight;
    private Backback backback;
    private Notebook[] notebooks;

    public Student(String name, double weight, Backback backback, Notebook[] notebooks) {
        this.name = name;
        this.weight = weight;
        this.backback = backback;
        this.notebooks = notebooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Backback getBackback() {
        return backback;
    }

    public void setBackback(Backback backback) {
        this.backback = backback;
    }

    public Notebook[] getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(Notebook[] notebooks) {
        this.notebooks = notebooks;
    }
}
