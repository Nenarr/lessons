public class Solution {
    public static void main(String[] args){
        // Задание 2
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Круг:");
        circle.display("Red", "Black");

        System.out.println("\nПрямоугольник:");
        rectangle.display("Синий", "Зелёный");

        System.out.println("\nТреугольник:");
        triangle.display("Жёлтый", "Оранжевый");
    }
}
