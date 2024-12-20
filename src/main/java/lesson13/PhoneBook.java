package lesson13;

import java.util.*;

public class PhoneBook {

    private final List<Entry> phoneBook = new ArrayList<>();

    private static class Entry {
        String surname;
        String phoneNumber;

        Entry(String surname, String phoneNumber) {
            this.surname = surname;
            this.phoneNumber = phoneNumber;
        }
    }

    public void add(String surname, String phoneNumber) {
        phoneBook.add(new Entry(surname, phoneNumber));
    }

    public List<String> get(String surname) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Entry entry : phoneBook) {
            if (entry.surname.equals(surname)) {
                phoneNumbers.add(entry.phoneNumber);
            }
        }
        return phoneNumbers;
    }

}
