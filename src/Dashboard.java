import javax.swing.*;

public class Dashboard extends JFrame {
    private JLabel Principal;
    private JPanel Dashboard;

    public Dashboard() {
        setTitle("Pantalla Principal");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Dashboard);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Dashboard);
        setContentPane(Principal);
        setLocationRelativeTo(null);
    }
}
