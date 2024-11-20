package layouts;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout1D extends JFrame{
    private JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        return botao;
    }
    
    public Layout1D() {
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        painel.add(criarBotao("Botão 1"));
        painel.add(criarBotao("Botão 2"));
        painel.add(criarBotao("Botão 3"));
        painel.add(criarBotao("Botão 4"));
        painel.add(criarBotao("Botão 5"));
        
        add(painel);
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}