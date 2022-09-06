package bridge;

public class Car {

    private String color;
    private int passengers;
    private double length;
    private String licensPlate;

    public Car(String color, int passengers, double length, String licensPlate) {
        this.color = color;
        this.passengers = passengers;
        this.length = length;
        this.licensPlate = licensPlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getLicensPlate() {
        return licensPlate;
    }

    public void setLicensPlate(String licensPlate) {
        this.licensPlate = licensPlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", passengers=" + passengers +
                ", length=" + length +
                ", licensPlate='" + licensPlate + '\'' +
                '}';
    }
}
