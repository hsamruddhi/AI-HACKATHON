Convert the following Java utility code into Python.

Requirements:
- Preserve the same logic and behavior.
- Follow Python best practices (PEP 8).
- Use Pythonic constructs where appropriate.
- Convert static utility methods into standalone Python functions or a utility class.
- Replace Java-specific features (e.g., Optional, Streams, Date, UUID) with Python equivalents.
- Add brief docstrings for each function.
- If exceptions are used, convert them to appropriate Python exceptions.
- Do not add extra functionality beyond the original code.

Java Code:
<PASTE JAVA CODE HERE>



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class StringDateUtil {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // Check if a string is null or empty
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    // Generate a random UUID string
    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    // Parse date from string
    public static LocalDate parseDate(String dateStr) {
        if (isNullOrEmpty(dateStr)) {
            throw new IllegalArgumentException("Date string cannot be null or empty");
        }
        return LocalDate.parse(dateStr, FORMATTER);
    }

    // Format date to string
    public static String formatDate(LocalDate date) {
        if (date == null) {
            return "";
        }
        return date.format(FORMATTER);
    }
}
