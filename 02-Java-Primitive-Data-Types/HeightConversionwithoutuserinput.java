class HeightConversion {
    public static void main(String[] args) {

        
        double heightCm = 170;

        
        double totalInches = heightCm / 2.54;


        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        
        System.out.println("Your Height in cm is =" + heightCm);
        System.out.println(" while in feet is " + feet );
        System.out.println("inches is " + String.format("%.2f", inches));
    }
}
