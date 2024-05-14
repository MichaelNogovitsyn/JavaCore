package src.resource.other;
import java.util.ArrayList;

public class Notes {
    protected ArrayList<Note> Notes;

    public Notes (ArrayList<Note> notes) {
        Notes = notes;
    }
    public Notes() {
        this(new ArrayList<>());
    }

    public Note CreateNote(String text_of_note){
        if (text_of_note==null){
            System.out.println("Enter the TEXT OF THE NOTE");
            return null;
        }
        Integer id = GetId();
        Note note = new Note(id,text_of_note);
        this.Notes.add(note);
        return note;
    }

    @Override
    public String toString() {
        return "NotesController{" +
                "Notes=" + Notes +
                '}';
    }

    protected Integer GetId(){
        return Notes.size() + 1;
    }

}