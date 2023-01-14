import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TemperatureConverter extends JFrame {
    private JLabel inputLabel, outputLabel;
    private JTextField inputField, outputField;
    private JButton convertButton;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel title = new JLabel("Temperature Converter", SwingConstants.CENTER);
        Font font = new Font("Verdana", Font.BOLD, 18);
        title.setFont(font);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        add(title, constraints);

        inputLabel = new JLabel("Temperature in Celsius:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        add(inputLabel, constraints);
        inputField = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        add(inputField, constraints);

        convertButton = new JButton("Convert");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        add(convertButton, constraints);
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double celsius = Double.parseDouble(inputField.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                outputField.setText(String.format("%.2f", fahrenheit));
            }
        });

        outputLabel = new JLabel("Temperature in Fahrenheit:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        add(outputLabel, constraints);
        outputField = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        add(outputField, constraints);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
