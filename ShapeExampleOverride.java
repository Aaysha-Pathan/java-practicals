package javaa;

class Shapee {
    double area() {
        return 0;
    }
}

class circle extends Shapee {
    double radius;

    circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class rect extends Shapee {
    double width, height;

    rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class ShapeTest {

    static void printArea(Shapee s) {
        System.out.println("Area: " + s.area());
    }
}

public class ShapeExampleOverride {

    public static void main(String[] args) {

        Shapee circle = new circle(5);
        Shapee rectangle = new rect(4, 6);

        ShapeTest.printArea(circle);
        ShapeTest.printArea(rectangle);
    }
}
