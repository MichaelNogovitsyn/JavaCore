package src.Lesson3.practice.test;

public class Home extends Buildings{

    Home(int floors) {
        super(floors);
    }

    @Override
    String shape() {
        return "square";
    }

}
