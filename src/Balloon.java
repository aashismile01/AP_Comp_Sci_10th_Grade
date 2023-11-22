// Balloon class
public class Balloon extends BalloonTester{
    private double volume;
    private double radius;

    // Constructor
    public Balloon() {
        volume = 0.0;
        radius = 0.0;
    }

    // Method to add air to the balloon
    public void addAir(double amount) {
        volume += amount;
        calculateRadius();
    }

    // Method to calculate and return the current volume
    public double getVolume() {
        return volume;
    }

    // Method to calculate and return the current surface area
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate and return the current radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate the radius from the volume
    private void calculateRadius() {
        radius = Math.cbrt((3 * volume) / (4 * Math.PI));
    }
}
