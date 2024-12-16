package lesson10;

public class Cat  extends Animal{
    private static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean isFull = false;

    public Cat(String _name) {
        super();
        catCount++;
        name = _name;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может столько пробежать");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(FoodBowl bowl) {
        if (bowl.getFoodAmount() >= 10) {
            bowl.decreaseFood(10);
            isFull = true;
        }

    }
}

