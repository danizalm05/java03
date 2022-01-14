 

public class Person {
    private int height;//cm
    private String id;
    private Car car;

    public Person() {
        this.height = 175;
        this.id = "000000000";
        this.car = new Car();
    }

    public Person(int height, String id, Car car) {
        this.height = height;
        this.id = id;
        this.car = car;
    }
}
