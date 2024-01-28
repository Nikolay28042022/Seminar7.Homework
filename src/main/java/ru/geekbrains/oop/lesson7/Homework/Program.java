package ru.geekbrains.oop.lesson7.Homework;

public class Program {

    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company company = new Company("ABC Corp", jobAgency, 100000);

        // Создаем соискателей
        Student student1 = new Student("John");
        Master master1 = new Master("Alice");
        Professional professional1 = new Professional("Bob");

        // Регистрируем соискателей в кадровом агентстве
        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(professional1);

        // Программа создает вакансии и рассылает их через кадровое агентство
        company.postVacancy();
        company.postVacancy();
        company.postVacancy();
    }
}

