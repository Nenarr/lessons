class Animal {
    String name;
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance) {
        System.out.println("Animal is running " + distance + " meters.");
    }

    public void swim(int distance) {
        System.out.println("Animal is swimming " + distance + " meters.");
    }
}