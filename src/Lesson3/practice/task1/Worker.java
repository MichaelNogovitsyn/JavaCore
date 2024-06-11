package src.Lesson3.practice.task1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Worker extends Personal {


    //    public Worker(String name, String surname, String middleName) {
//        this.setName(name);
//        this.setSurname(surname);
//        this.setMiddleName(middleName);
//    }
    public Worker( String surname, String name, String midlename, String position, String phoneNumber, int salary, LocalDate birthDate) {
        super(name,surname,midlename);
        this.setPosition(position);
        this.setPhoneNumber(phoneNumber);
        Personal.setSalary(this,salary);
        setBirthDate(birthDate);
        this.age = getAge();
    }
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + this.getName() + '\'' +
                ", surname='" + this.getSurname() + '\'' +
                ", middlName='" + this.getMiddleName() + '\'' +
                ", position='" + this.getPosition() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", age=" + this.getAge() +
                ", salary=" + this.getSalary() +
                '}';
    }

    public static int middleAge(Worker[] workers){
        int totalleAge=0;
        for (Worker each : workers) {
            totalleAge += each.getAge();
            System.out.println(each.getAge());

        }

        return totalleAge/ workers.length;
    }

}
