package org.example;

public class ParkCommands extends Commands{
    public ParkCommands() {
        super("Park Vehicle", new String[]{"Car", "Van","Motorcycle", "Back" }, "park");
    }

    @Override
    public void run() {
        printGreeting();
        printCommands();

        int userInput = getIntegerInput();

        if (userInput == 1) {
            Car newCar = new Car();
            CarPark.takeVehicleSpot(newCar.getSize(), newCar.getType());
            printMessage(CarPark.getInfo());
            CarPark.getInfo();
            setNextCommands("park");
        } else if (userInput == 2) {
            Van newVan = new Van();
            CarPark.takeVehicleSpot(newVan.getSize(), newVan.getType());
            printMessage(CarPark.getInfo());
            setNextCommands("park");
        } else if (userInput == 3) {
            Motorcycle newMotorcycle = new Motorcycle();
            CarPark.takeMotorcycleSpot();
            printMessage(CarPark.getInfo());
            setNextCommands("park");
        } else {
            setNextCommands("home");
        }
    }
}
