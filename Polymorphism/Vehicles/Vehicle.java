package p01_Vehicle;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumptionPerKm;
    private double distance;
    private double refueling;

    public Vehicle(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
        setFuelConsumptionPerKm(fuelConsumptionPerKm);
    }

    protected String drive(double distance) {
        StringBuilder sb = new StringBuilder();

        double neededFuelToDrive = distance * this.getFuelConsumptionPerKm();
        DecimalFormat df = new DecimalFormat("#.##");

        if (this.getFuelQuantity() >= neededFuelToDrive) {
           this.fuelQuantity -= neededFuelToDrive;
            sb.append(String.format("%s travelled %s km",this.getClass().getSimpleName(), df.format(distance)))
                    .append(System.lineSeparator());
        } else {
            sb.append(String.format("%s needs refueling", this.getClass().getSimpleName()))
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
    public void refuel(double liters) {
        this.fuelQuantity += liters;
    }

    public double getDistance() {
        return distance;
    }

    public double getRefueling() {
        return refueling;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public double setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        return this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
