import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Graeme on 21/09/2016.
 */
public class JCapitals extends JFrame implements ItemListener {
    FlowLayout flowLayout = new FlowLayout();
    JComboBox<String> box = new JComboBox<String>();
    JTextField field = new JTextField(10);
    JLabel label = new JLabel("Select country: ");
    JLabel label2 = new JLabel("Capital: ");

    String[] countries = {"Australia", "France", "Spain", "USA", "Germany", "Japan", "England"};
    String[] capitals = {"Canberra", "Paris", "Madrid", "Washington D.C.", "Berlin", "Tokyo", "London"};

    String country;
    String out;
    int countryIndex;

    public JCapitals(){
        setLayout(flowLayout);
        box.addItemListener(this);
        for (int i = 0; i < countries.length; i++){
            box.addItem(countries[i]);
        }
        box.addItemListener(this);
        add(label);
        add(box);
        add(label2);
        add(field);
        setSize(200, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object object = e.getSource();
        if (object == box){
            countryIndex = box.getSelectedIndex();
            country = countries[countryIndex];
            out = ""+capitals[countryIndex];
            field.setText(out);
        }
    }

    public static void main(String[] args) {
        JCapitals capitals = new JCapitals();
    }
}
