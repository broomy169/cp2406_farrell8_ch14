import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Graeme on 21/09/2016.
 */
public class JHistoricalFacts extends JFrame implements ActionListener {

    FlowLayout flowLayout = new FlowLayout();
    JButton button = new JButton("Display Fact");

    JLabel label1 = new JLabel("Fact 1");
    JLabel label2 = new JLabel("Fact 2");
    JLabel label3 = new JLabel("Fact 3");
    JLabel label4 = new JLabel("Fact 4");
    JLabel label5 = new JLabel("Fact 5");

    int count = 0;

    public JHistoricalFacts(){
        setLayout(flowLayout);
        setVisible(true);
        setSize(200, 100);
        add(button);
        add(label1);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++count;
        switch(count){
            case 1:
                remove(label1);
                add(label2);
                break;
            case 2:
                remove(label2);
                add(label3);
                break;
            case 3:
                remove(label3);
                add(label4);
                break;
            case 4:
                remove(label4);
                add(label5);
                break;
            case 5:
                remove(label5);
                add(label1);
                count = 0;
        }

        validate();
        repaint();
    }

    public static void main(String[] args) {
        JHistoricalFacts facts = new JHistoricalFacts();
    }
}
