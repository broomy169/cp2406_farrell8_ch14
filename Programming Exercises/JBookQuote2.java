import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Graeme on 21/09/2016.
 */
public class JBookQuote2 extends JFrame implements ActionListener{


    FlowLayout flowLayout = new FlowLayout();
    JLabel label = new JLabel("Quote 1");
    JLabel label2 = new JLabel("Quote 2");
    JLabel label3 = new JLabel("Source");
    JButton button = new JButton("Source");

    public JBookQuote2(){
        setLayout(flowLayout);
        setVisible(true);
        setSize(150,150);
        add(label);
        add(label2);
        add(button);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JBookQuote2 book = new JBookQuote2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        add(label3);
        validate();
        repaint();
    }
}
