package layouts;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Layout2B extends JFrame{
    private JLabel criarTexto(String texto, int tamBorda) {
        JLabel textLabel = new JLabel(texto);
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setVerticalAlignment(SwingConstants.CENTER);
        textLabel.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.GRAY, tamBorda), // Borda preta de 2px
                new EmptyBorder(10, 10, 10, 10)  // Padding (top, left, bottom, right)
        ));

        return textLabel;
    }

    private JPanel painelOeste() {
        JPanel painel = new JPanel();

        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setPreferredSize(new Dimension(100, 0));

        painel.add(criarTexto("Cliente", 0));
        painel.add(criarTexto("Produto", 0));
        painel.add(criarTexto("Vendas", 0));
        painel.add(criarTexto("Arquivo", 0));
        
        painel.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(Color.GRAY, 1), // Borda preta de 2px
            new EmptyBorder(10, 10, 10, 10)  // Padding (top, left, bottom, right)
        ));

        return painel;
    }

    private JPanel painelPostagem() {
        JPanel painel = new JPanel();

        painel.setLayout(new BorderLayout(5,5));

        painel.add(criarTexto("Titulo", 1), BorderLayout.NORTH);
        painel.add(criarTexto("Postagem", 1), BorderLayout.CENTER);
        painel.add(criarTexto("Autor", 1), BorderLayout.SOUTH);

        painel.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(Color.GRAY, 1), // Borda preta de 2px
            new EmptyBorder(10, 10, 10, 10)  // Padding (top, left, bottom, right)
        ));

        return painel;
    }

    private JPanel painelLeste() {
        JPanel painel = new JPanel();
        painel.setPreferredSize(new Dimension(100, 0));

        painel.add(criarTexto("Propagandas", 0));

        painel.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(Color.GRAY, 1), // Borda preta de 2px
            new EmptyBorder(10, 10, 10, 10)  // Padding (top, left, bottom, right)
        ));
        return painel;
    }

    private JPanel painelCentro() {
        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(2, 2));

        for (int i = 0; i < 4; i++) {
            painel.add(painelPostagem());
        }

        return painel;
    }
    
    public Layout2B() {
        setLayout(new BorderLayout(20,20));

        add(criarTexto("Título", 1), BorderLayout.NORTH);
        add(criarTexto("Rodapé", 1), BorderLayout.SOUTH);
        add(painelOeste(), BorderLayout.WEST);
        add(painelLeste(), BorderLayout.EAST);
        
        add(painelCentro(), BorderLayout.CENTER);

        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}