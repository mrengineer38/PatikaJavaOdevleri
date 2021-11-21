package com.company;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double raiseSalary() { //Method Zam
        if (2021 - hireYear < 10) {
            return 5 * (salary / 100);
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            return 10 * (salary / 100);
        } else if (2021 - hireYear > 19) {
            return 15 * (salary / 100);
        } else {
            return salary;
        }
    }

    double tax() { //Method Vergi
        if (this.salary > 1000) {
            return 3 * (salary / 100);
        } else {
            return 0.0;
        }
    }

    double bonus() { //Method Bonus
        if (workHours > 40) {
        return (workHours-40)*30;
        }
        else {
        return 0.0;
        }
    }
    public void _toString() {
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + (raiseSalary()));
        System.out.println("Vergi ve Bonuslarla Birlikte maaş : " +(bonus()+this.salary-tax()));
        System.out.println("Toplam Maaş : " + (this.salary+raiseSalary()));

    }
}

