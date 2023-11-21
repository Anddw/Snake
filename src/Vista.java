import javax.swing.*;

public class Vista extends JFrame {

    public Vista() {
        this.setLocationRelativeTo(null);
        PanelFondo fondo = new PanelFondo(800, 40);
        this.add(fondo);
        fondo.setBounds(10, 10, 800, 800);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Vista vista = new Vista();
            vista.setVisible(true);
        });
    }
}
