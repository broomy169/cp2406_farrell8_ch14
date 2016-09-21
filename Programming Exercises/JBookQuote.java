import javax.swing.*;
import java.awt.*;

/**
 * Created by Graeme on 21/09/2016.
 */
public class JBookQuote extends JFrame{

    FlowLayout flowLayout = new FlowLayout();
    JLabel label = new JLabel("Quote 1");
    JLabel label2 = new JLabel("Quote 2");

    public JBookQuote(){
        setLayout(flowLayout);
        setVisible(true);
        setSize(150,100);
        add(label);
        add(label2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JBookQuote book = new JBookQuote();
    }
}
