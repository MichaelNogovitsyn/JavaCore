package src.Lesson3.practice;

import java.util.Random;

public abstract class Buildings {
    private int floors = 1;
    public String name = "new";
    Random random= new Random();
    public float maxJump = 100.0F;
    public float difJump = random.nextFloat() * maxJump;
    private boolean office = false;
    static private int id = 0;
    private int uid=0;

    Buildings(int floors) {
        this.floors = floors;
        this.uid = ++id;
        this.difJump = difJump;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOffice() {
        return office;
    }

    public void setOffice(boolean office) {
        this.office = office;
    }

    public int getId() {
        return uid;
    }


    abstract String shape();


    @Override
    public String toString() {
        return "name: " + name + ", floors: " + floors + ", office: " + office;
    }
}
