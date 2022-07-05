package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println(CarPark.getInfo());
//        CarPark.takeMotorcycleSpot();
//        System.out.println(CarPark.getInfo());
//        CarPark.takeVehicleSpot(3);
//        System.out.println(CarPark.getInfo());

        Commands currentCommands = new HomeCommands();

        currentCommands.printMessage(CarPark.getInfo());

        boolean isActive = true;

        while (isActive) {
            switch (currentCommands.getNextCommands()) {

                case "home":
                    currentCommands = new HomeCommands();
                    currentCommands.run();
                    break;

                case "park":
                    currentCommands = new ParkCommands();
                    currentCommands.run();
                    break;

                case "stats":
                    currentCommands.printMessage(CarPark.getInfo());
                    currentCommands.printMessage(CarPark.getStats());

                    currentCommands.setNextCommands("home");
                    break;

                default:
                    isActive = false;
            }
        }
    }
}