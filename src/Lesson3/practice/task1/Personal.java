package src.Lesson3.practice.task1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Personal{
    private String name;
    private String surname;
    private String middleName;
    private String position;
    private String phoneNumber;
    public  int  age;
    private int salary;
    private LocalDate birthDate;
    private Task task;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Personal(String surname, String name, String middleName){
    this.name = name;
    this.surname = surname;
    this.middleName = middleName;
    task = new Task("Work");
    }


    public String getName() {
        return name;
    }
public void setName(String name) {
    this.name = name;
}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAge() {
        return this.birthDate == null ? -1 :  (int) this.birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public static void setSalary(Personal personal, int salary) {
        personal.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate == null || birthDate.isAfter(LocalDate.now().minusYears(10))){
            System.out.println(" Worker is too yung");
        }
        else this.birthDate = birthDate;
    }

}


