package src;

import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;
public class MyCanvas extends Canvas {

    public MyCanvas(int w, int h) {
        setSize(w, h);
        setBackground(Color.WHITE);
    }

    private void drawAxle(Graphics g) {
        var x1 = 0;
        var y1 = getHeight() / 2;
        var x2 = getWidth();
        var y2 = getHeight() / 2;
        g.drawLine(x1, y1, x2, y2);

        x1 = getWidth() / 2;
        y1 = 0;
        x2 = getWidth() / 2;
        y2 = getHeight();
        g.drawLine(x1, y1, x2, y2);
    }

    private void drawUnitys(Graphics g) {
        for (var i = getWidth() / 2; i > 0; i -= 100) {
            g.setColor(Color.BLACK);
            g.drawLine(i, (getHeight() / 2) - 5, i, (getHeight() / 2) + 5);
            g.setColor(Color.BLUE);
            g.drawString(String.valueOf((i / 100) - 3), i - 10, (getHeight() / 2) + 20);
        }

        for (var i = getWidth() / 2; i < 700; i += 100) {
            g.setColor(Color.BLACK);
            g.drawLine(i, (getHeight() / 2) - 5, i, (getHeight() / 2) + 5);
            g.setColor(Color.BLUE);
            g.drawString(String.valueOf((i / 100) - 3), i - 10, (getHeight() / 2) + 20);
        }

        for (var i = getHeight() / 2; i > 0; i -= 100) {
            g.setColor(Color.BLACK);
            g.drawLine((getWidth() / 2) - 5, i, (getWidth() / 2) + 5, i);
            var label = ((i / 100) - 2) * (-1);
            if (label != 0) {
                g.setColor(Color.BLUE);
                g.drawString(String.valueOf(label), (getWidth() / 2) - 20, i);
            }
        }

        for (var i = getHeight() / 2; i < 500; i += 100) {
            g.setColor(Color.BLACK);
            g.drawLine((getWidth() / 2) - 5, i, (getWidth() / 2) + 5, i);
            var label = ((i / 100) - 2) * (-1);
            if (label != 0) {
                g.setColor(Color.BLUE);
                g.drawString(String.valueOf(label), (getWidth() / 2) - 20, i);
            }
        }

        g.setColor(Color.RED);
        g.drawLine((getWidth() / 2) + 100, (getHeight() / 2) - 100,
                (getWidth() / 2) + 200, (getHeight() / 2) - 200);
    }

    @Override
    public void paint(Graphics g) {
        drawAxle(g);
        drawUnitys(g);
    }
}
