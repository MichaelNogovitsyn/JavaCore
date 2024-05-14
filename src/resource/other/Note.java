package src.resource.other;
import java.time.LocalDateTime;

public class Note {
    protected LocalDateTime date;
    protected Integer id;
    protected String note;

    public Note(Integer id,String note) {
        this.id = id;
        this.note = note;
        this.date = LocalDateTime.now().withNano(0);
    }
    @Override
    public String toString() {
        return date +
                ": " + note + ';';
    }
}
