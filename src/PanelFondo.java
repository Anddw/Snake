import javax.swing.*;
import java.awt.*;

public class PanelFondo extends JPanel {
    Color colofondo = Color.gray;
    int tammax, tam, can, res;

    public PanelFondo(int tammax, int can) {
        this.tammax = tammax;
        this.can = can;
        this.tam = tammax / can;
        this.res = tammax % can;
    }

    @Override
    public void paint(Graphics pintor) {
        super.paint(pintor);
        pintor.setColor(colofondo);

        int offsetX = res / 2;
        int offsetY = res / 2;

        for (int i = 0; i < can; i++)
            for (int j = 0; j < can; j++) {
                pintor.fillRect(offsetX + i * tam, offsetY + j * tam, tam - 1, tam - 1);
            }
    }
}
