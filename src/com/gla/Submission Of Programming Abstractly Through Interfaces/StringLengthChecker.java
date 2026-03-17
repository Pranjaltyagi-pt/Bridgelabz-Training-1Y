import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        String message = "Hello Functional Interface";

        // Function to calculate length
        Function<String, Integer> getLength = str -> str.length();

        int length = getLength.apply(message);

        System.out.println("Message Length: " + length);

        if (length > 20) {
            System.out.println("Message exceeds limit!");
        } else {
            System.out.println("Message within limit.");
        }
    }
}