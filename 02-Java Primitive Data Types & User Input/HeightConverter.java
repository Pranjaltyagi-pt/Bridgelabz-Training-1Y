import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter height in centimeters: ");
        double heightCm = sc.nextDouble();

        
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        
        System.out.println("Your Height in cm is =" + heightCm) ;
            System.out.println(" while in feet is= " + feet);
            System.out.println("inches is= " + inches);
    }
}
