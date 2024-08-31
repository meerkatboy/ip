import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {
    private LocalDateTime deadlineTime;
    public Deadline(String name, LocalDateTime deadlineTime) {
        super(name);
        this.deadlineTime = deadlineTime;
    }
    @Override
    public String toString() {
        String newFormat = this.deadlineTime.format(DateTimeFormatter.ofPattern("MMM d yyyy K:mma"));
        return "[D]" + super.toString() + " (by: " + newFormat + ")";
    }

    @Override
    public String toParseableString() {
        String s = "d,";
        if (this.isCompleted()) {
            s += "m,";
        }
        else {
            s += "u,";
        }
        s += this.getName() + "," + this.deadlineTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm"));
        return s;
    }
}
