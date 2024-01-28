package ru.geekbrains.oop.lesson7.Homework;

interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void postVacancy(Vacancy vacancy);
}
