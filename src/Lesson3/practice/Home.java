package src.Lesson3.practice;

public class Home extends Buildings{

    Home(int floors) {
        super(floors);
    }

    @Override
    String shape() {
        return "square";
    }

}
