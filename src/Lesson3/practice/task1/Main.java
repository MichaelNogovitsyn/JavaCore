package src.Lesson3.practice.task1;

import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        // 2 задача
        System.out.println("______".repeat(20));
        System.out.println( "1 задача ");

        Worker worker = new Worker(" Ivanov","Ivan","Vasilivich","Developer",
                "1",  200, LocalDate.of(1986,1,2));
        Worker worker2 = new Worker(" Petrov","Vovan","Ivanovich","Junior",
                "2",  100, LocalDate.of(2003,5,8));
        Worker worker3 = new Worker(" Sidorov","Kesha","Sergeevich","Middle",
                "3",  500, LocalDate.of(2006,7,5));
        Worker worker4 = new Worker("Abramov","Alik","Alekseevich","Sinior",
                "41",  300, LocalDate.of(2001,9,21));
        Worker worker5 = new Worker("Borisov","Gosha","Sergeevich","New",
                "5",  400, LocalDate.of(2000,11,20));
        Manager manager1 = new Manager("Kozlov","Kostya","Sergeevich","New", "5",  600, LocalDate.of(2000,11,20));


        Personal [] personals = {worker,worker2,worker3,worker4,worker5,manager1};
        System.out.println(Arrays.toString(personals));

        System.out.println("исходный список: ");
        List<Personal> workerArrayList =Arrays.asList(personals);
        System.out.println(workerArrayList);
        System.out.println("Список сортированный по фамилии: ");
        SurnameComparator surnameComparator = new SurnameComparator();
        workerArrayList.sort(surnameComparator);
        System.out.println(workerArrayList);

        // 2 задача
        System.out.println("______".repeat(20));
        System.out.println( "2 задача ");
        for (int i = 0; i < personals.length; i++) {
            Manager.setSalary(personals[i],personals[i].getSalary()+200);
        }
        System.out.println(workerArrayList);

        // 3 задача
        System.out.println("______".repeat(20));
        System.out.println( "3задача ");
        Task task1 = new Task("Написать Программу для робота");
        Task task2 = new Task(" Доделать сайт");
        Task task3 = new Task(" Написать инструкцию");

        System.out.println("Задача работника по умолчанию - " + worker2.getTask());
        worker2.setTask(task1);
        System.out.println("Назначенная задача работником - "+ worker2.getTask());

        manager1.setTask(worker2,task2);
        System.out.println("Назначенная задача работнику руководителем - "+ worker2.getTask());

        System.out.println("Задача руководителя по умолчанию - " + manager1.getTask());
        manager1.setTask(task3);
        System.out.println("Назначенная задача руководителю "+ manager1.getTask());


        }


    }




