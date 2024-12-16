package lesson10;

class Dog extends Animal {
    private static int dogCount = 0;
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String _name) {
        super();
        dogCount++;
        name = _name;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE && distance > 0) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может столько пробежать");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE && distance > 0) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не может столько проплыть");
        }
    }
}
