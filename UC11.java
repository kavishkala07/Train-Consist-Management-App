import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (can be replaced with user input later)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Define regex patterns
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate inputs
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Display results
        System.out.println("\nTrain ID: " + trainId);
        System.out.println("Train ID Valid: " + isTrainValid);

        System.out.println("\nCargo Code: " + cargoCode);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        // Invalid example (for demonstration)
        String invalidTrainId = "TRN12A";
        Matcher invalidMatcher = trainPattern.matcher(invalidTrainId);

        System.out.println("\nInvalid Train ID: " + invalidTrainId);
        System.out.println("Train ID Valid: " + invalidMatcher.matches());

        System.out.println("\nProgram continues...");
    }
}
