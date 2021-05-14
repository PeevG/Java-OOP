package p01_Vehicle;

public class Car extends Vehicle {


    public Car(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity);
        setFuelConsumptionPerKm(fuelConsumptionPerKm);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters);
    }

    @Override
    public double getDistance() {
        return super.getDistance();
    }

    @Override
    public double getRefueling() {
        return super.getRefueling();
    }

    @Override
    public double getFuelConsumptionPerKm() {
        return super.getFuelConsumptionPerKm();
    }

    @Override
    public double setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        return super.setFuelConsumptionPerKm(fuelConsumptionPerKm + 0.9);
    }
}
