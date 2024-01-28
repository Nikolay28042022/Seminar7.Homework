package ru.geekbrains.oop.lesson7.Homework;

import java.util.ArrayList;
import java.util.Collection;

class JobAgency implements Publisher {
    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void postVacancy(Vacancy vacancy) {
        for (Observer observer : observers){
            observer.receiveVacancy(vacancy);
        }
    }
}

