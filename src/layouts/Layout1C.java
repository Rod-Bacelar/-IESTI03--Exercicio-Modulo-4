package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout;

public class Layout1C extends JFrame{
    public Layout1C() {
        setLayout(new GridLayout(3, 2));

        add(new JButton("Botão 1"));
        add(new JButton("Botão 2"));
        add(new JButton("Botão 3"));
        add(new JButton("Botão 4"));
        add(new JButton("Botão 5"));
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}