import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        try {
            java.io.FileReader fr = new java.io.FileReader("Sample.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
