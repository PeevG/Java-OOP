package p06_Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private String model;

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }
    @Override
    public String brakes(){
       return "Brakes!";
    }
    @Override
    public String gas() {
       return "brum-brum-brum-brrrrr";
    }
    //"{model}/{brakes}/{gas pedal}/{driver's name}"


    public String getModel() {
        return model = "488-Spider";
    }

    public String getDriverName() {
        return driverName;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", this.getModel(), brakes(), gas(), this.getDriverName());
    }
}
