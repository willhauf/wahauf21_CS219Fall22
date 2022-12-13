package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is the "base class".  GUIPanel is the "derived" class.
public class GUIPanel extends JPanel {

    private JTextField zipcode;
    private JButton submit;
    private JButton Northernmost;
    private JTextArea output;
    private DataBase db;    // The zipcode database


    public GUIPanel() {
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);

        this.submit = new JButton("submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());

        this.Northernmost = new JButton("Northernmost");
        this.add(this.Northernmost);
        this.Northernmost.addActionListener(new NorthernmostButtonListener());

        this.output = new JTextArea(5, 20);
        this.add(this.output);

        this.db = new DataBase();   // load the zipcodes
    }

    class SubmitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // fn will get called when the user presses submit

            // get the zipcode out of the text field
           String code = zipcode.getText();
           Zipcode zc = db.search(code);
           WeatherObservation wob = zc.getWeatherData();
           output.setText(wob.toString());
        }
    }

    class NorthernmostButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // fn will get called when the user presses Northernmost

            Zipcode zc = db.getNorthern();
            output.setText(zc.toString());
        }
    }

}
