package ru.geekbrains.oop.lesson7.Homework;

class Professional implements Observer {
    private String name;

    public Professional(String name) {
        this.name = name;
    }

    @Override
    public void receiveVacancy(Vacancy vacancy) {
        if (vacancy.getJobType() == JobType.PROFESSIONAL) {
            System.out.printf("Профессионал %s: Меня заинтересовала вакансия! (компания: %s; заработная плата: %d; тип: %s)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getJobType());
        } else {
            System.out.printf("Профессионал %s: Эта вакансия не для меня. (компания: %s; заработная плата: %d; тип: %s)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getJobType());
        }
    }
}
