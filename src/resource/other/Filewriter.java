package src.resource.other;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    protected String name_of_file;
    protected java.io.File file;
    protected final String file_was_created = "The file was successfully created";
    protected final String the_file_exists = "The file has been overwritten";
    protected final String save_error = "Error writing to the file";
    protected  final String save_completed = "The save was successful";

    public Filewriter(String name_of_file) {
        this.name_of_file = name_of_file;
    }

    protected void CreatingFile(String name_of_file){
        this.file = new java.io.File(name_of_file);
        try {
            if (this.file.exists()) System.out.println(the_file_exists);
            else {boolean created = this.file.createNewFile();
                if (created) System.out.println(file_was_created);}
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void SavinToTheFile(String text){
        CreatingFile(name_of_file);
        try(FileWriter fw = new FileWriter(this.file,false)) {
            fw.write(text);
            System.out.println(save_completed);
        } catch (IOException e) {
            System.out.println(save_error);
        }
    }
}