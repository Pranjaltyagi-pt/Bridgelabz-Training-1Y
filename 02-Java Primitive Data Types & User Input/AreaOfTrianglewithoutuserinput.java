class AreaOfTriangle {
    public static void main(String[] args) {

        
        double base = 10.0;     
        double height = 5.0;

        
        double areaInSquareInches = 0.5 * base * height;

        
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

      
        System.out.println("The area of the triangle in square inches is "
                + areaInSquareInches +
                " and in square centimeters is "
                + areaInSquareCentimeters);
    }
}
