package src.Lesson3.practice.test;

public class Build extends Buildings{
    Build(String name,int floors, boolean type) {
        super(floors);
        setFloors(floors);
        setOffice(type);
        super.name = name;
    }

    @Override
    String shape() {
        return null;
    }
}
