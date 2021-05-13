package P04_TrafficLights;

public enum  TrafficLight {
    RED("GREEN"),
    GREEN("YELLOW"),
    YELLOW("RED");

    private String colorNext;

    TrafficLight(String colorNext){
        this.colorNext =colorNext;
    }

    @Override
    public String toString() {
        return String.format("%s", this.colorNext);
    }
}
