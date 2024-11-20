package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Layout1A extends JFrame{
    public Layout1A() {
        setLayout(new FlowLayout());

        add(new JButton("Um"));
        add(new JButton("Dois"));
        add(new JButton("Tres"));
        add(new JButton("Quatro"));

        
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}