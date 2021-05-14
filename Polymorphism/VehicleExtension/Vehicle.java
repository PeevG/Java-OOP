package p02_VehicleExtension;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumptionPerKm;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.tankCapacity = tankCapacity;
        setFuelConsumptionPerKm(fuelConsumptionPerKm);
    }

    protected String drive(double distance) {
        StringBuilder sb = new StringBuilder();

        double neededFuelToDrive = distance * this.getFuelConsumptionPerKm();
        DecimalFormat df = new DecimalFormat("#.##");

        if (this.getFuelQuantity() >= neededFuelToDrive) {
            this.fuelQuantity -= neededFuelToDrive;
            sb.append(String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance)))
                    .append(System.lineSeparator());
        } else {
            sb.append(String.format("%s needs refueling", this.getClass().getSimpleName()))
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

    public void refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.fuelQuantity + liters > this.tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += liters;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
