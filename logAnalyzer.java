import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class logAnalyzer {
    private static final String FILE_NAME = "events.log";

    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        String logEntry = "[" + now + "] " + message;

        // Print to console (optional but helpful)
        System.out.println(logEntry);

        // Write to file in append mode
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(logEntry);
            writer.write(System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Logging has failed");
        }
    }
}