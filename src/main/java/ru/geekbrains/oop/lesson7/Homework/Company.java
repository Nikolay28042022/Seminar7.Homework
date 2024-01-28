package ru.geekbrains.oop.lesson7.Homework;

import java.util.Random;
public class Company {

    private Random random = new Random();
    private Publisher jobAgency;

    private String name;
    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void postVacancy() {
        int salary = random.nextInt(maxSalary);
        JobType jobType = JobType.values()[random.nextInt(JobType.values().length)];
        Vacancy vacancy = new Vacancy(name, salary, jobType);
        jobAgency.postVacancy(vacancy);
    }
}
