import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Create main frame
        JFrame frame = new JFrame("Ace Banking");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setBackground(Color.black);
        frame.setLayout(new BorderLayout());

        //Login Panel
        JPanel loginPanel = new JPanel(new BorderLayout());
        loginPanel.setOpaque(false);
    }
}