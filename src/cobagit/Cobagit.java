package cobagit;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.*;

public class Cobagit extends JFrame {

    private static final long serialVersionUID = 1L;

    public Cobagit() {
        initUI();
    }

    private void initUI() {
        setTitle("Simple example");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel lbl = new JLabel();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Cobagit ex = new Cobagit();
                ex.setVisible(true);
            }
        });
    }
}
