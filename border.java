import java.awt.*;
import java.applet.*;

/* <applet code = "gld class" height = "400" width = "200"> </applet> */

public class border extends Applet {
    public void init() {
        setBackground(Color.cyan);
        setLayout(new BorderLayout());
        add(new Button("This is across the top"), BorderLayout.NORTH);
        add(new Button("Footer message goes here"), BorderLayout.SOUTH);
        add(new Button("RIGHT"), BorderLayout.EAST);
        add(new Button("LEFT"), BorderLayout.WEST);
        String msg = "This is the center of the applet";
        add(new TextArea(msg), BorderLayout.CENTER);
    }
    public Insets getInsets() {
        return new Insets(10, 10, 10, 10);
    }
}
