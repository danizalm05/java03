 
/*
com.Car
Introduction to Java Class - Object oriented Programming
--------------------------------------------------------
 7. https://www.youtube.com/watch?v=CxlHy4JC0SQ&list=PLXuLP_lLi2eBoYWqukzSuevdKxyFu-ZiT&index=7
 13. https://www.youtube.com/watch?v=U6vdPgF2QKw&list=PLXuLP_lLi2eBoYWqukzSuevdKxyFu-ZiT&index=13

 */
public class Mcar {
     public static void main(String[] args) {
        Car benz = new Car(10,33,6);


        System.out.println("Benz has "+ benz.getDoors() + " doors");
        System.out.println("Benz is priced at "+ benz.getPrice() + " dollars");
        System.out.println("The mileage being :" + benz.getMileage());

        Car Audi = new Car();
        Car Ram = new Car(6);



        System.out.println("Audi has "+Audi.getDoors() + " doors");
        System.out.println("Audi is priced at: "+Audi.getPrice() + " dollars");
        System.out.println("The mileage being :"+Audi.getMileage());


        System.out.println("Ram has "+ Ram.getDoors() + " doors");
        System.out.println("Ram is priced at "+ Ram.getPrice() +" dollars");
        System.out.println("Ram's mileage being :" +Ram.getMileage());

        System.out.println("Ram's mileage being :" +benz.carStart());
        benz.carShutOff();



        DirtCar dirtyBenz = new DirtCar(20.5,50000,6,50);

        dirtyBenz.setMileage(6);
        dirtyBenz.setDoors(2);
        dirtyBenz.setPrice(250000);
        dirtyBenz.setDirtyTerrainTopSpeed(45);


        System.out.println("Dirty Benz's mileage is:" + dirtyBenz.getMileage());
        System.out.println("Dirty Benz's Door count:" + dirtyBenz.getDoors());
        System.out.println("Dirty Benz's price is:" + dirtyBenz.getPrice());
        System.out.println("Dirty Benz's Terrain Top Speed is:" + dirtyBenz.getDirtyTerrainTopSpeed());


        System.out.println(dirtyBenz.startDirtCar());

    }
}
