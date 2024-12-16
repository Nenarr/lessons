package lesson6;

public class Person {
    String name;
    String job_title;
    String email;
    String phone_number;
    int salary;
    int age;
    public Person(String _name, String _job_title, String _email, String _phone_number, int _salary, int _age){
        name = _name;
        job_title = _job_title;
        email = _email;
        phone_number = _phone_number;
        salary = _salary;
        age = _age;
        System.out.println("ФИО: " + name + "\nДолжность: " + job_title + "\nEmail: " + email + "\nТелефонный номер: " + phone_number + "\nЗаработная плата: " + salary + "\nВозраст: " + age + "\n");
    }
    public Person(){
        name = "Petrova Marina";
        job_title = "Accountant";
        email = "petrik@yana.ru";
        phone_number = "89266666666";
        salary = 70000;
        age = 41;
        System.out.println("ФИО: " + name + "\nДолжность: " + job_title + "\nEmail: " + email + "\nТелефонный номер: " + phone_number + "\nЗаработная плата: " + salary + "\nВозраст: " + age + "\n");
    }
}
