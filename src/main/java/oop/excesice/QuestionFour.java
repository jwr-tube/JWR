package oop.excesice;

public class QuestionFour {
    public static void main(String[] args) {
        /*
        Create a car and bike as following details
            object name = ourCar, color = white, number= “PGT-16451”
            object name = ourBike, color = blue, number= “VGT-76415”
        */
        Vehicle ourCar = new Vehicle("white", "PGT-16451");
        Vehicle ourBike = new Vehicle("blue","VGT-76415");

        //Start the ourCar by calling start() method
        ourCar.start();

        //Start the ourBike by calling start() method
        ourBike.start();

        //Create Vehicle type object reference named “daddyCar”
        Vehicle daddyCar;

        //Print numbers of the ourCar
        System.out.println(ourCar.getNumber());

        //Assign ourCar to daddyCar reference  (daddyCar = ourCar )
        daddyCar = ourCar;

        //Print numbers of the daddyCar
        System.out.println(daddyCar.getNumber());

        //Assign ourBike to null as (ourBike = null)
        ourBike = null;

        //Start the ourBike by calling start() method
        ourBike.start();
    }
}

class Vehicle{
    String color;
    String number;

    public Vehicle(String color, String number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    //Create a method named start() to print “started...”
    void start(){
        System.out.println("started...");
    }
}
