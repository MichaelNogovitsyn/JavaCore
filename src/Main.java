package src;
import src.resource.other.Filewriter;
import src.resource.other.Note;
import src.resource.other.Notes;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    String output_text = "Enter new note: ";
    String file_name;
        if (args.length == 0 ) file_name = "file.txt";
        else file_name = args[0];
    Scanner input = new Scanner(System.in);
        System.out.print(output_text);
    String text_of_notes = input.next();
    Filewriter fw = new Filewriter(file_name);
    Note note = new Notes().CreateNote(text_of_notes);
        fw.SavinToTheFile(note.toString());
}
}
