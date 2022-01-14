 

public class Car {
    public static int totalID = 0;


    private int price;
    private int id;
    private int numberOfSeats;
    private int maxSpeed;

    private String color;
    private String company;

    public Car() {
        totalID++;
        this.id = totalID;
        this.price = 150000;
        this.numberOfSeats= 4;
        this.maxSpeed= 200;

        this.color = "black";
        this.company="Nissan";

    }

    public Car(int price, int numberOfSeats, int maxSpeed, String color, String company) {
        totalID++;
        this.id = totalID;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.company = company;
    }
    public Car(Car c){
        totalID++;
        this.id = totalID;
        this.price = c.price;
        this.numberOfSeats = c.numberOfSeats;
        this.maxSpeed = c.maxSpeed;
        this.color = c.color;
        this.company = c.company;
   }
   //Geters
    public int getPrice() {
        return this.price;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getColor() {
        return this.color;
    }

    public String getCompany() {
        return this.company;
    }

  //Seters
    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int value){
        this.id =value;
    }
    public String toString() {
        return "Car{" +
                "price=" + this.price +
                ", numberOfSeats=" + this.numberOfSeats +
                ", maxSpeed=" + this.maxSpeed +
                ", color='" + this.color + '\'' +
                ", company='" + this.company + '\'' +
                ", ID='" + this.id + '\'' +
                '}';
    }
}

