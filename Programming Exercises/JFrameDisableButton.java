import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Graeme on 21/09/2016.
 */
public class JFrameDisableButton extends JFrame implements ActionListener{
    JButton button = new JButton("Press");

    Container container = getContentPane();
    FlowLayout flowLayout = new FlowLayout();
    public JFrameDisableButton(){
        container.setLayout(flowLayout);
        container.add(button);
        button.addActionListener(this);
        setVisible(true);
        setSize(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setEnabled(false);
    }
}
