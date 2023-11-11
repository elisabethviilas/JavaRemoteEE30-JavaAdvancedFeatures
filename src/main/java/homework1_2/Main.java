package homework1_2;

public class Main {
    public static void main(String[] args){
        MovablePoint point = new MovablePoint(1,2,3,4);
        MovableCircle circle = new MovableCircle(5,6,7,8,9);

        point.moveUp();
        circle.moveRight();

        System.out.println("Point: " + point);
        System.out.println("Circle: " + circle);

        Movable movableObject1 = new MovablePoint(1,1,1,1);
        Movable movableObject2 = new MovableCircle(0,0,2,2,3);

        movableObject1.moveDown();
        movableObject2.moveLeft();

        System.out.println("Object 1: " + movableObject1);
        System.out.println("Object 2: " + movableObject2);
    }
}
