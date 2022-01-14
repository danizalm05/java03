 

public class Car {
    //mileage, price, doors count

    //fields are set private - > encapsulation
    private double mileage;
    private int price;
    private int doors;

    public Car(double mileages,int prices, int doors){
        this.mileage = mileages;  // set class's field mileage to equal to mileage from the method.
        this.price = prices;
        this.doors = doors;
    }

    public Car(int doors){
        this.doors=doors;
    }

    public Car() {
        this(11,22,44);
       // this.mileage =  11;  // set class's field mileage to equal to mileage from the method.
       // this.price =   22;
      //  this.doors =  44;
    }

    public double getMileage() {
        return  this.mileage;
    }

    public int getPrice() {
        return  this.price;
    }

    public int getDoors() {
        return  this.doors;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    public String carStart(){
        return "Car Started";
    }

    public void carShutOff(){
        System.out.println("Car Engine off");
    }


}