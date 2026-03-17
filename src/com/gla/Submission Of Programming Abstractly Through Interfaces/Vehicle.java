interface Vehicle {

    void displaySpeed();

    // Default method for new feature
    default void displayBattery() {
        System.out.println("Battery info not available.");
    }
}