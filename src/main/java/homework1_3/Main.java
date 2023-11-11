package homework1_3;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(5.0);
        ResizableCircle resizableCircle = new ResizableCircle(8.0);

        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());

        System.out.println("Resizable Circle Radius: " + resizableCircle.getRadius());
        System.out.println("Resizable Circle Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Resizable Circle Area: " + resizableCircle.getArea());

        resizableCircle.resize(20);

        System.out.println("Resizable Circle Radius after resize: " + resizableCircle.getRadius());
        System.out.println("Resizable Circle Perimeter after resize: " + resizableCircle.getPerimeter());
        System.out.println("Resizable Circle Area after resize: " + resizableCircle.getArea());
    }
}
