package lesson10;

public class Main {
    public static void main(String[] args){
        // Задание 1
        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Бэлыч");
        cat1.run(200);
        cat1.swim(1);
        System.out.println();
        dog1.run(350);
        dog1.swim(10);

        FoodBowl bowl = new FoodBowl(21);

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Обжорка");
        catsArray[1] = new Cat("Кузя");
        catsArray[2] = new Cat("Казах");
        catsArray[3] = new Cat("Илья");
        catsArray[4] = new Cat("Старый");

        for (int i = 0; i<5; i++){
            if (bowl.getFoodAmount() < 10){
                bowl.addFood(13);
            }

            catsArray[i].eat(bowl);

            System.out.println("\nЕды осталось в чашке: " + bowl.getFoodAmount());
            System.out.println("Кот " + catsArray[i].name + " сыт? " + catsArray[i].isFull());
        }

        System.out.println("\nВсего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());

    }
}
