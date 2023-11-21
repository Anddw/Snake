import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class PanelSnake extends JPanel {
    Color Colorsnake = Color.blue;
    Color colorcomida = Color.red;
    int tammax, tam, can, res;
    List<int[]> snake;
    int [] comida;

    public PanelSnake(int tammax, int can) {
        this.tammax = tammax;
        this.can = can;
        this.tam = tammax / can;
        this.res = tammax % can;
        this.snake = new ArrayList<>();

        int[] a = {can / 2 - 1, can / 2 - 1};
        int[] b = {can / 2 - 1, can / 2 - 1};

    }

    @Override
    public void paint(Graphics pintor) {
        super.paint(pintor);
        pintor.setColor(Colorsnake);
        pintor.setColor(colorcomida);

        int offsetX = res / 2;
        int offsetY = res / 2;

        for (int i = 0; i < can; i++)
            for (int j = 0; j < can; j++) {
                pintor.fillRect(offsetX + i * tam, offsetY + j * tam, tam - 1, tam - 1);
            }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("PanelSnake Demo");
            PanelSnake panel = new PanelSnake(800, 40);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel);
            frame.setSize(800, 800);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
