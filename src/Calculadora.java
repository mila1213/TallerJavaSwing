import javax.swing.*;

public class Calculadora extends JFrame {

    private JTextField textField1;   // Número 1
    private JTextField textField2;   // Número 2
    private JTextField textField3;   // Resultado
    private JButton button1;        // Sumar
    private JButton button2;        // Restar
    private JButton button3;        // Multiplicar
    private JButton button4;        // Dividir
    private JPanel PanelCalcular;   // Panel principal del form

    public Calculadora() {


        setTitle("Calculadora");
        setSize(400, 300);
        setContentPane(PanelCalcular);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // BOTÓN SUMAR
        button1.addActionListener(e -> operar('+'));

        // BOTÓN RESTAR
        button2.addActionListener(e -> operar('-'));

        // BOTÓN MULTIPLICAR
        button3.addActionListener(e -> operar('*'));

        // BOTÓN DIVIDIR
        button4.addActionListener(e -> operar('/'));

        setVisible(true);
    }

    private void operar(char operador) {
        try {
            double n1 = Double.parseDouble(textField1.getText());
            double n2 = Double.parseDouble(textField2.getText());
            double r = 0;

            switch (operador) {
                case '+': r = n1 + n2; break;
                case '-': r = n1 - n2; break;
                case '*': r = n1 * n2; break;
                case '/':
                    if (n2 == 0) {
                        JOptionPane.showMessageDialog(this, "No se puede dividir entre cero");
                        return;
                    }
                    r = n1 / n2;
                    break;
            }

            textField3.setText(String.valueOf(r));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }
    }
}
