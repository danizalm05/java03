 

public class Cat extends Mammal{
    private int mustachLength;
    private int jumpHeight;

    public Cat(int weight, int height, String color, int mp, int mn, int ml, int jh) {
        super(weight, height, color, mp, mn);
        this.mustachLength = ml;
        this.jumpHeight = jh;
    }

    public int getMustachLength() {
        return mustachLength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setMustachLength(int mustachLength) {
        this.mustachLength = mustachLength;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}

