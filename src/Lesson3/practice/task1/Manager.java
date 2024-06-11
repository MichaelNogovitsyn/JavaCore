package src.Lesson3.practice.task1;

import java.time.LocalDate;

public class Manager extends Personal {

    public Manager(String surname, String name, String midlename, String position, String phoneNumber, int salary, LocalDate birthDate) {
        super(name, surname, midlename);
        this.setPosition(position);
        this.setPhoneNumber(phoneNumber);
        Personal.setSalary(this,salary);
        setBirthDate(birthDate);
        this.age = getAge();
    }

    public static void  setSalary(Personal personal, int salary) {
        if (personal instanceof Worker) {
            Personal.setSalary(personal,salary);
        }

    }

    public void setTask(Personal personal,Task task) {
            personal.setTask(task);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + this.getName() + '\'' +
                ", surname='" + this.getSurname() + '\'' +
                ", middlName='" + this.getMiddleName() + '\'' +
                ", position='" + this.getPosition() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", age=" + this.getAge() +
                ", salary=" + this.getSalary() +
                '}';
    }
}

