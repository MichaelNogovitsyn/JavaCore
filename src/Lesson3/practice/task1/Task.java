package src.Lesson3.practice.task1;

public class Task {
    String task = "Работать";
    public void setTask (String name) {
        task = name;
    }
public Task(String name){
        task = name;
}
    @Override
    public String toString() {
        return task;
    }
}
