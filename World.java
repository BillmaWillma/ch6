import java.util.List;
import java.util.Objects;

public final class World {

    private static final List<String> DEFAULT_MESSAGES = List.of(
        "jj",
        "ii",
        "yy",
        "oo",
        "She said \"Hello\" to me"
    );

    private World() {
        // Utility class: prevent instantiation.
    }

    public static void main(String[] args) {
        List<String> messages = args.length == 0
                ? DEFAULT_MESSAGES
                : List.of(args);

        printMessages(messages);
    }

    public static void printMessages(List<String> messages) {
        Objects.requireNonNull(messages, "Messages cannot be null");

        for (int i = 0; i < messages.size(); i++) {
            String message = Objects.requireNonNull(
                messages.get(i),
                "Message at index " + i + " cannot be null"
            );

            System.out.printf("%s%n", message);
        }
    }

    public static String formatMessages(List<String> messages) {
        Objects.requireNonNull(messages, "Messages cannot be null");

        return String.join(
            System.lineSeparator(),
            messages
        );
    }
}
