package lesson13;

public class Task2 {
    public static void main(String[] args){
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+790788888888");
        phoneBook.add("Иванов", "+996703277928");
        phoneBook.add("Малышев", "+792721747475");
        phoneBook.add("Стукалов", "+790704230661");

        System.out.println("Телефоны Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Стукалов: " + phoneBook.get("Стукалов"));

    }
}
