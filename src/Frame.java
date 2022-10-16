package src;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame() {
        var w = 640;
        var h = 480;
        setSize(w, h);
        setTitle("CG - Lucas Sales [01351184]");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new MyCanvas(w, h));
        setVisible(true);
    }
}
