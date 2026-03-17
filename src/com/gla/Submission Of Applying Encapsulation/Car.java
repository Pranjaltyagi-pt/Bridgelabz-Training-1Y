class Car extends Vehicle implements GPS {

    private String location;

    public Car(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // base charge
    }

    public void getCurrentLocation() {
        System.out.println("Car Location: " + location);
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}