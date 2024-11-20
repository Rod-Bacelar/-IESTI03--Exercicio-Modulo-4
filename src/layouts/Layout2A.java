package layouts;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Layout2A extends JFrame{
    private JPanel criarCampoInput(String texto, int tamanhoCampo) {
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());

        painel.add(new JLabel(texto));
        painel.add(new JTextField(tamanhoCampo));
        

        return painel;
    }

    private JPanel painelEsquerdo() {
        JPanel painel = new JPanel();
        JPanel painelInputs = new JPanel();

        painelInputs.setLayout(new BoxLayout(painelInputs, BoxLayout.Y_AXIS));
        
        for (int i = 0; i < 4; i++) {
            painelInputs.add(criarCampoInput("Campo" + (i + 1), 10));
        }

        painel.setLayout(new GridLayout(2, 1));

        painel.add(painelInputs);
        painel.add(new JButton("Salvar"));
        painel.setBorder(new EmptyBorder(20, 20, 20, 20));

        return painel;
    }

    private JLabel criarTexto(String texto) {
        JLabel textLabel = new JLabel(texto);
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setVerticalAlignment(SwingConstants.CENTER);
        textLabel.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.GRAY, 1), // Borda preta de 2px
                new EmptyBorder(10, 10, 10, 10)  // Padding (top, left, bottom, right)
        ));

        return textLabel;
    }

    private JPanel painelDireito() {
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout(10, 10));

        painel.add(criarTexto("Titulo"), BorderLayout.NORTH);
        painel.add(criarTexto("Rodapé"), BorderLayout.SOUTH);
        painel.add(criarTexto("Imagem 1"), BorderLayout.WEST);
        painel.add(criarTexto("Imagem 2"), BorderLayout.EAST);
        painel.add(criarTexto("Lorem Ipsun"), BorderLayout.CENTER);

        painel.setBorder(new EmptyBorder(20, 20, 20, 20));

        return painel;
    }
    
    public Layout2A() {
        setLayout(new GridLayout(1, 2, 20, 20));

        add(painelEsquerdo());
        add(painelDireito());
;        
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}