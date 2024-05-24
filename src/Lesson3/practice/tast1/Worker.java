package src.Lesson3.practice.tast1;

import java.time.LocalDate;

public class Worker {
    private String name;
    private String surname;
    private String middlName;
    private String position;
    private String phoneNumber;
    private int age;
    private int salary;
    private LocalDate birthDate;

    public Worker(String name, String surname, String middlName, String position, String phoneNumber, int age, int salary, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.middlName = middlName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public Worker(String name, String surname, String middlName) {
        this.name = name;
        this.surname = surname;
        this.middlName = middlName;
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

    public String getMiddlName() {
        return middlName;
    }

    public void setMiddlName(String middlName) {
        this.middlName = middlName;
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
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
