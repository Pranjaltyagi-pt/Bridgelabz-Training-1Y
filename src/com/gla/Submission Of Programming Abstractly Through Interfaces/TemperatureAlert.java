import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        double temperature = 38.5;

        // Alert if temperature > 37
        Predicate<Double> isHighTemp = t -> t > 37;

        if (isHighTemp.test(temperature)) {
            System.out.println("⚠ High Temperature Alert!");
        } else {
            System.out.println("Temperature is Normal.");
        }
    }
}