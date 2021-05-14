package p02_VehicleExtension;

public class Car extends Vehicle {


    public Car(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity,fuelConsumptionPerKm, tankCapacity);
    }
    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        super.setFuelConsumptionPerKm(fuelConsumptionPerKm + 0.9);
    }
}
