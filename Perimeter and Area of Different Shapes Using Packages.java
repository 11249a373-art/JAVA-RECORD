File 1: Shapes.java

package shapes;

public class Shapes {

    public void rectangle(int l, int b) {
        System.out.println("Rectangle Area = " + (l * b));
        System.out.println("Rectangle Perimeter = " + (2 * (l + b)));
    }

    public void square(int s) {
        System.out.println("Square Area = " + (s * s));
        System.out.println("Square Perimeter = " + (4 * s));
    }

    public void circle(double r) {
        System.out.println("Circle Area = " + (3.14 * r * r));
        System.out.println("Circle Perimeter = " + (2 * 3.14 * r));
    }
}

File 2: Main.java

import shapes.Shapes;

public class Main {
    public static void main(String[] args) {

        Shapes s = new Shapes();

        s.rectangle(10, 5);
        s.square(4);
        s.circle(3);
    }
}
