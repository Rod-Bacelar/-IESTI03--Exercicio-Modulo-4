package layouts;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Layout2C extends JFrame{
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

    private JPanel painelDireito() {
        JPanel painel = new JPanel();
        
        JPanel image = new JPanel();
        image.setBorder(new LineBorder(Color.GRAY, 1));
        
        painel.setLayout(new BorderLayout(20, 20));
        painel.add(image, BorderLayout.CENTER);
        painel.add(new JButton("Carregar Imagem"), BorderLayout.SOUTH);

        painel.setBorder(new EmptyBorder(10, 10, 10, 10));
        return painel;
    }

    private JPanel painelBotao() {
        JPanel painel = new JPanel();

        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        painel.add(new JButton("Salvar"));
        painel.add(new JButton("Cancelar"));
        painel.add(new JButton("Voltar"));

        return painel;
    }

    private JPanel painelEsquerdo() {
        JPanel painel = new JPanel();
        
        JTextArea textArea = new JTextArea();
        textArea.setBorder(new LineBorder(Color.GRAY, 1));
        
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(criarTexto("Titulo do Texto", 0));
        painel.add(textArea);
        painel.add(painelBotao());
        

        painel.setBorder(new EmptyBorder(10, 10, 10, 10));
        return painel;
    }

    private JPanel painelCentro() {
        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(1, 2));

        painel.add(painelEsquerdo());
        painel.add(painelDireito());

        return painel;
    }
    
    public Layout2C() {
        setLayout(new BorderLayout(20,20));

        add(criarTexto("Título", 1), BorderLayout.NORTH);
        add(painelCentro(), BorderLayout.CENTER);

        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}