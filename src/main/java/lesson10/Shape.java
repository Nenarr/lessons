package lesson10;

interface Shape {
    double calculatePerimeter();
    double calculateArea();

    // Default method to display figure details
    default void display(String fillColor, String borderColor) {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границ: " + borderColor);
    }
}
