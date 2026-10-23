import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("simple.txt");
            fw.write("Hello, this is a FileWriter Program.");
            fw.write("In Java is easy to learn.");
            fw.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occured.");
        }
    }
}
