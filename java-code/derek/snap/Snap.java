 

//https://www.youtube.com/watch?v=6UkeKf_rAcA&list=PLPjzC7XXuyAlD-JeryvYJ8fjzN-A9s_Ub&index=19
//https://www.youtube.com/watch?v=U3HyI-UokGY&list=PLPjzC7XXuyAlD-JeryvYJ8fjzN-A9s_Ub&index=20
//https://www.youtube.com/watch?v=pSp0CFZLsIY&list=PLPjzC7XXuyAlD-JeryvYJ8fjzN-A9s_Ub&index=21

public class Snap {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(2345,7,250,"REd","Honda");
        Car c3 = new Car(c1);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.getPrice());

        Car [] cArr = new Car[3];
        for (int i = 0; i < cArr.length; i++){
            cArr[i] = new Car();
        }
        for (int i = 0; i < cArr.length; i++){
            System.out.println(cArr[i].getId());
        }
        System.out.println(cArr[1].getCompany() );

    Animal a = new Animal(50,80,"Red");
    Mammal m = new Mammal(70,90,"white",45,22);
    System.out.println(m.getMilkProduction()+" L" );
    System.out.println(m.getHeight()+" cm");

    Dog d = new Dog(20,70,"green",22,12,"Pincher","Wille",false);
    System.out.println("MilkProduction = "+d.getMilkProduction());

    Cat c = new Cat(20,122,"blue",12,22,12,3);
    System.out.println("getHeight() = "+c.getHeight()+" cm");
    
    
    //Chapter 19  polymorfezim
    Mammal[] pets = new Mammal[4];
    for (int i = 0; i < pets.length ; i++) {
        if (i% 2 == 0){
           pets[i] = new Dog(70+i,120,"blue",12,122,"chocho","Bobi"+i,false);
          }else {
           pets[i] = new Cat(40+i,34+i,"purple",12+i,3,2*i,23);
          }
      }

        System.out.println("Scan pets array and Down casting"+'\n'+"================");

        for (int i = 0; i < pets.length ; i++) {
          if(pets[i] instanceof Dog){
             System.out.println("Dog "+(  (Dog)pets[i]).getName()  ); //Down casting
          }else if(pets[i] instanceof Cat){
              System.out.println("Cat "+( (Cat)pets[i]).getMustachLength()  );

          }


        }

        System.out.println("Scan pets array and Up casting"+'\n'+"================");

        for (int i = 0; i < pets.length ; i++) {
            //System.out.println(pets[i].getHeight());
            //All the array Cat or Dog is a Mamal
            System.out.println( pets[i].getHeight() ); // Up casting Doesn't work

        }

        Animal caat  = new Cat(40,34,"purple",12,3,2,23);
        System.out.println("caat instanceof Animal ==> "+ (caat instanceof Animal) );
        System.out.println("caat instanceof Cat ==> "+ (caat instanceof Cat) );
        ((Cat) caat).getMilkProduction();
    }
}







/*
* Create an artifact configuration for the JAR
-------------------------------------------------
1. File | Project Structure/ Artifacts.
2. + button/ point to JAR / From modules with dependencies.
3. To the right of the Main Class field,
       click the Browse button and select HelloWorld (com.example.helloworld) in the dialog that opens.
4.  Apply

*/
/* Build the JAR artifact
------------------------------------
1. From the main menu, select Build | Build Artifacts.(Line 6)
2. Point to HelloWorld:jar and select Build.
3. Look at the out/artifacts folder, you'll find your JAR there.
*
* To make sure that the JAR artifact is created correctly.
  Ctrl+Shift+A to search for actions and settings across the entire IDE.
* */

/*Create a run configuration for the packaged application
* ----------------------------------------
1.Press Ctrl+Shift+A, find and run the Edit Configurations action.
2. Run/Debug Configurations dialog, click the Add button and select
  JAR Application.
3.Name the new configuration: HelloWorld.
4.In the Path to JAR field/Browse /specify the path to the JAR file.
5.Scroll down the dialog and under Before launch, click the Add button|Build Artifacts | HelloWorld:jar
* */