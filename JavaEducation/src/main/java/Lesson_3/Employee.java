package Lesson_3;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String info() {
        System.out.println("Имя: " + name + "; Должность: " +
                position + "; email: " + email + "; Номер телефона: " + phoneNumber + "; Зарплата " +
                salary + "; Возраст: " + age);
        return null;
    }
    public String toString() {
        return info();
    }

    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];

        emplArray[0] = new Employee("Kozlov Maxim", "Director", "wycc220@mailbox.com", "756187135", 60000, 60);
        emplArray[1] = new Employee("Strebkov Arseniy", "Engineer", "semka7721@mailbox.com", "892312312", 40000, 25);
        emplArray[2] = new Employee("Strebkov Terentiy", "Accountant", "taerss@mailbox.com", "758689159", 40000, 27);
        emplArray[3] = new Employee("Sokolov Dmitriy", "Caretaker", "beastqt@mailbox.com", "171989877", 40000, 50);
        emplArray[4] = new Employee("Chernov Radu", "Builder", "pagyra@mailbox.com", "196716631", 40000, 41);

        for (int i = 0; i < emplArray.length; i++) {
            Employee employee = emplArray[i];
            if (employee.age > 40) {
                System.out.println(employee);
            }
        }
    }
}