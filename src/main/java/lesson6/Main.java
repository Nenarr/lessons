package lesson6;

public class Main {
    public static void main(String[] args){
        //Задание 1
        System.out.println("Задание 1\n");
        Person per = new Person();

        //Задание 2

        System.out.println("Задание 2\n");

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "iviviviv@mail.ru", "89277777777", 40000, 25);
        persArray[1] = new Person("Kuznecov Wlahid","Manager", "wlah@mail.ru", "89299999999", 20000, 31);
        persArray[2] = new Person("Novikov Igor", "CEO", "notanigor@mail.ru", "89222222222", 60000, 23);
        persArray[3] = new Person("Mazinsky Alexey","QA Engineer", "LEXA@mail.ru", "89233333333", 100, 19);
        persArray[4] = new Person("Starikov Ilya", "Cleaning engineer", "starost@mail.ru", "89244444444", 50, 27);

    }
}