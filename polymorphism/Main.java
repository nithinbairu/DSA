package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Shapes triangle=new Triangle();
        Shapes circle=new Circle();
        Shapes square=new Square();

        shape.area();
        triangle.area();
        square.area();
        circle.area();
    }
}
