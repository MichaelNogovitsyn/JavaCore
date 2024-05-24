package src.Lesson3.practice;

public class Main {
    public static void main(String[] args) {
        Home home1 = new Home(2);
        System.out.println(home1);
        System.out.println(home1.shape());

        Home home2 = new Home(3);
        System.out.println(home1.getId());
        System.out.println(home2.getId());

        System.out.println(home1.difJump);
        System.out.println(home2.difJump);

        Build b1 = new Build("Office",10,true);
        System.out.println(b1);
    }
}
