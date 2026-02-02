class DistanceConversion {
    public static void main(String[] args) {


        double distanceInFeet = 5280.0;

       
        double distanceInYards = distanceInFeet / 3;

        
        double distanceInMiles = distanceInYards / 1760;

        
        System.out.println("The distance in feet is " + distanceInFeet +
                " while in yards is " + distanceInYards +
                " and in miles is " + distanceInMiles);
    }
}
