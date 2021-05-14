package p01_Vehicle;

public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity);
        setFuelConsumptionPerKm(fuelConsumptionPerKm);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }

    @Override
    public double setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        return super.setFuelConsumptionPerKm(fuelConsumptionPerKm + 1.6);
    }
}
