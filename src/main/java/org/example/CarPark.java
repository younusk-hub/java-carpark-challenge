package org.example;

public class CarPark {
    private static int MotorcycleSpotsMax;
    private static int VehicleSpotsMax;

    private static int MotorcycleSpotsTaken;
    private static int VehicleSpotsTaken;
    private static int totalMotorcycles;
    private static int totalVans;
    private static int totalCars;

    static {
        MotorcycleSpotsMax = 5;
        VehicleSpotsMax = 10;

        totalMotorcycles = (int)(Math.random() * 5);
        totalVans = (int)(Math.random() * 2);
        totalCars = (int)(Math.random() * 4);

        MotorcycleSpotsTaken = totalMotorcycles;
        VehicleSpotsTaken = (totalVans * 3) + totalCars;
    }

    public static int getTotalMotorcycles() {
        return totalMotorcycles;
    }

    public static int getTotalVans() {
        return totalVans;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public static int totalSpots() {
        return MotorcycleSpotsMax + VehicleSpotsMax;
    }

    public static int totalAvailableSpots() {
        return totalSpots() - (MotorcycleSpotsTaken + VehicleSpotsTaken);
    }

    public static String getInfo() {
        return String.format("\nCar Park Capacity: %d\nTotal Spots Remaining: %d\nVehicle Spots Remaining: %d\nMotorCycle Spots Remaining: %d", totalSpots(), totalAvailableSpots() , VehicleSpotsMax - getVehicleSpotsTaken(), MotorcycleSpotsMax - getMotorcycleSpotsTaken());
    }

    public static String getStats() {
        return String.format("\nTotal Cars: %d\nTotal Vans: %d\nTotal Motorcycles: %d\n\nVan/Vans are taking up %d spots in total.", getTotalCars(), getTotalVans(), getTotalMotorcycles(), getTotalVans()*3);
    }



    public static int getMotorcycleSpotsTaken() {
        return MotorcycleSpotsTaken;
    }

    public static void takeMotorcycleSpot() {
        if (MotorcycleSpotsMax - (MotorcycleSpotsTaken + 1) >= 0) {
            MotorcycleSpotsTaken += 1;
            totalMotorcycles += 1;
        } else {
            System.out.println("Motorcycle Spots are full!");
            takeVehicleSpot(1, "Motorcycle");
        }
    }

    public static int getVehicleSpotsTaken() {
        return VehicleSpotsTaken;
    }

    public static void takeVehicleSpot(int vehicleSize, String type) {
        if (VehicleSpotsMax - (VehicleSpotsTaken + vehicleSize) >= 0) {
            VehicleSpotsTaken += vehicleSize;
            if (type == "Van") {
                totalVans += 1;
            } else if (type == "Car") {
                totalCars += 1;
            } else if (type == "Motorcycle") {
                totalMotorcycles += 1;
            }
        } else {
            System.out.println("No Space for this Vehicle");
        }
    }


}
