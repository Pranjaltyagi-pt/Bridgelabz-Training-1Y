abstract class vahicle {

    /**
     * Starts the vehicle.
     * Subclasses must provide their own implementation.
     */
    abstract void start();

    /**
     * Displays fuel type.
     * This method should not be overridden unnecessarily.
     */
    void fuelType() {
        System.out.println("Uses fuel");
    }
}