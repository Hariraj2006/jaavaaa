import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class ArithmeticDemo extends JFrame {
    private JTextField num1Field, num2Field;
    private JButton addButton, subButton, mulButton, divButton, bgButton;
    private JLabel resultLabel;

    public ArithmeticDemo() {
        setTitle("Arithmetic Operations in Swing");
        setSize(500, 350);
        setLayout(null);

        // First number input
        num1Field = new JTextField();
        num1Field.setBounds(50, 30, 120, 30);
        num1Field.setBorder(new LineBorder(Color.BLUE, 2));
        add(num1Field);

        // Second number input
        num2Field = new JTextField();
        num2Field.setBounds(200, 30, 120, 30);
        num2Field.setBorder(new LineBorder(Color.GREEN, 2));
        add(num2Field);

        // Arithmetic buttons
        addButton = new JButton("Add");
        addButton.setBounds(50, 80, 100, 30);
        addButton.setBackground(Color.CYAN);
        add(addButton);

        subButton = new JButton("Subtract");
        subButton.setBounds(170, 80, 100, 30);
        subButton.setBackground(Color.PINK);
        add(subButton);

        mulButton = new JButton("Multiply");
        mulButton.setBounds(50, 130, 100, 30);
        mulButton.setBackground(Color.ORANGE);
        add(mulButton);

        divButton = new JButton("Divide");
        divButton.setBounds(170, 130, 100, 30);
        divButton.setBackground(Color.LIGHT_GRAY);
        add(divButton);

        // Background change button
        bgButton = new JButton("Change Background");
        bgButton.setBounds(300, 80, 150, 30);
        bgButton.setBackground(Color.MAGENTA);
        add(bgButton);

        // Result label
        resultLabel = new JLabel("Result will appear here");
        resultLabel.setBounds(50, 200, 350, 30);
        resultLabel.setOpaque(true);
        resultLabel.setBackground(Color.YELLOW);
        resultLabel.setBorder(new LineBorder(Color.RED, 3));
        add(resultLabel);

        // Action listeners
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(num1Field.getText());
                double n2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Sum: " + (n1 + n2));
                resultLabel.setBackground(Color.GREEN);
            }
        });

        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(num1Field.getText());
                double n2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Difference: " + (n1 - n2));
                resultLabel.setBackground(Color.CYAN);
            }
        });

        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(num1Field.getText());
                double n2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Product: " + (n1 * n2));
                resultLabel.setBackground(Color.ORANGE);
            }
        });

        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(num1Field.getText());
                double n2 = Double.parseDouble(num2Field.getText());
                if (n2 != 0) {
                    resultLabel.setText("Quotient: " + (n1 / n2));
                    resultLabel.setBackground(Color.MAGENTA);
                } else {
                    resultLabel.setText("Error: Division by zero!");
                    resultLabel.setBackground(Color.RED);
                }
            }
        });

        // Background change button listener
        bgButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Random background color each time
                Color randomColor = new Color(
                        (int)(Math.random() * 256),
                        (int)(Math.random() * 256),
                        (int)(Math.random() * 256)
                );
                getContentPane().setBackground(randomColor);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ArithmeticDemo();
    }
}
