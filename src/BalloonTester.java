public class BalloonTester {
    public static void main(String[] args) {
        Balloon balloon = new Balloon();

        // Add 100 cm3 of air
        balloon.addAir(100);

        // Test the accessor methods
        double volume = balloon.getVolume();
        double surfaceArea = balloon.getSurfaceArea();
        double radius = balloon.getRadius();

        System.out.println("Volume: " + volume + " cm^3");
        System.out.println("Surface Area: " + surfaceArea + " cm^2");
        System.out.println("Radius: " + radius + " cm");

        // Add another 100 cm3 of air
        balloon.addAir(100);

        // Test the accessor methods again
        volume = balloon.getVolume();
        surfaceArea = balloon.getSurfaceArea();
        radius = balloon.getRadius();

        System.out.println("\nAfter adding 100 cm^3 of air:");
        System.out.println("Volume: " + volume + " cm^3");
        System.out.println("Surface Area: " + surfaceArea + " cm^2");
        System.out.println("Radius: " + radius + " cm");
    }
}


