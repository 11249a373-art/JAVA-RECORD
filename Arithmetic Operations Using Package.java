File 1: Arithmetic.java

package mypack;

public class Arithmetic {
    public void calculate(int a, int b) {
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));
    }
}

File 2: Main.java

import mypack.Arithmetic;

public class Main {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        a.calculate(10, 5);
    }
}

