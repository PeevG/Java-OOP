package p02_VehicleExtension;

public class Bus extends Vehicle {
    private static final boolean DEFAULT_IS_EMPTY = true;
    private boolean isEmpty;

    public Bus(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity,fuelConsumptionPerKm,tankCapacity);
       setIsEmpty(DEFAULT_IS_EMPTY);
    }

    @Override
    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        if(!this.isEmpty) {
            super.setFuelConsumptionPerKm(fuelConsumptionPerKm + 1.4);
        }
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
}
