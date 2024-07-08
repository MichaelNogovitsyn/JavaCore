package src.Lesson4.Task2;

public class Costumer {
    private  String name;
    private  int age;
    public   String ptone;

    public Costumer(String name, int age, String ptone) {
        this.name = name;
        this.age = age;
        this.ptone = ptone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPtone() {
        return ptone;
    }

    public void setPtone(String phone) {
        this.ptone = phone;
    }

    @Override
    public String toString() {
        return "Costumer{" + name + ", " +
                age +
                ", "  + ptone + '\'' +
                '}';
    }
}
