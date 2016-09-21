import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Graeme on 21/09/2016.
 */
public class JFrameDisableButton2 extends JFrame implements ActionListener{
    JButton button = new JButton("Press");
    JLabel label = new JLabel("That's enough.");

    Container container = getContentPane();
    FlowLayout flowLayout = new FlowLayout();

    int count = 0;

    public JFrameDisableButton2(){
        container.setLayout(flowLayout);
        container.add(button);
        container.add(label);
        button.addActionListener(this);
        label.setVisible(false);
        setVisible(true);
        setSize(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameDisableButton2 frame = new JFrameDisableButton2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++count;
        if(count == 8) {
            button.setEnabled(false);
            label.setVisible(true);
        }

    }
}
