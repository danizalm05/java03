 

public class Mammal extends Animal{
    protected int milkProduction;
    protected int milkNeeded;

    //Constructor
    public Mammal(int weight, int height, String color,int mp,int mn) {
       super( weight, height, color);//Constractor of Animal
        this.milkProduction = mp;
        this.milkNeeded = mn;
    }

    public int getMilkProduction() {
        return milkProduction;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }
}
