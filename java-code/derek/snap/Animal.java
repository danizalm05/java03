

public class Animal {
    protected int weight;
    protected int height;
    protected String color;

    public Animal(int weight, int height, String color) {
        this.weight = weight;
        this.height = height;
        this.color = color + "";
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

    public String getColor() {
        return this.color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
