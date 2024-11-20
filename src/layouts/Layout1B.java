package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;

public class Layout1B extends JFrame{
    public Layout1B() {
        setLayout(new BorderLayout());

        add(new JButton("Botão 1"), BorderLayout.NORTH);
        add(new JButton("Botão 2"), BorderLayout.CENTER);
        add(new JButton("Botão 3"), BorderLayout.WEST);
        add(new JButton("Botão 4"), BorderLayout.SOUTH);
        add(new JButton("Botão 5"), BorderLayout.EAST);
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}