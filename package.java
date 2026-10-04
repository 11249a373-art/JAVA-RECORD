File 1: Student.java

package mypackage;

public class Student {
    public void display() {
        System.out.println("Hello Student");
    }
}

File 2: Main.java


import mypackage.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
