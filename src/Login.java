import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel Login_panel;
    private JTextField Pass;
    private JTextField Usuario;
    private JButton accesoButton;

    public Login() {
        setTitle("Pantalla principal");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Login_panel);
        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dashboard();
                /*;
                Pass.getText();
                double val1 = Double.parseDouble(Usuario.getText());
                double val2 = Double.parseDouble(Pass.getText());
                double suma;
                suma = val1 + val2;
                JOptionPane.showMessageDialog(null, suma);*/
                //Insertar Valores quemados
                 String passw = Pass.getText();
                 String usuario = Usuario.getText();
                if (Pass.getText().equals("1234") && Usuario.getText().equals("Cami")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    dispose();
                    new Dashboard();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalido");
                    Usuario.setText("");
                    Pass.setText("");
                }




            }
        });
    }


}
