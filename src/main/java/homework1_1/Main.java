package homework1_1;

public class Main {
    public static void main(String[] args){
       Shape shape = new Shape("Red", true);
       Circle circle = new Circle("Blue", false, 5);
       Rectangle rectangle = new Rectangle("Green", true, 3, 4);
       Square square = new Square("Yellow", false, 2);

       System.out.println(shape.toString());
       System.out.println(circle.toString());
       System.out.println(rectangle.toString());
       System.out.println(square.toString());

       System.out.println("Circle Area: " + circle.getArea());
       System.out.println("Circle Perimeter: " + circle.getPerimeter());
       System.out.println("Rectangle Area: " + rectangle.getArea());
       System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
       System.out.println("Square Area: " + square.getArea());
       System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
