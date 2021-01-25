import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Represents an Event task that start at a specific time and ends at a specific time.
 */
public class Event extends Task {

    protected LocalDate at;

    /**
     * Creates an event instance.
     *
     * @param description String describing the event
     * @param at          String containing the event time
     */
    public Event(String description, LocalDate at) {
        super(description);
        this.at = at;
    }

    /**
     * Returns a String which gives information about the event.
     *
     * @return A String containing information about the event.
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }
}