package Mandiri;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JavaxSwingBoxLayout {
    private static boolean isVisible = true;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setMinimumSize(new Dimension(600, 600));
            frame.setLayout(new BoxLayout(frame.getContentPane(), 1));
            frame.setLocationRelativeTo(null);

            JPanel panel1 = new JPanel();
            panel1.setBackground(Color.RED);
            // panel1.setPreferredSize(new Dimension(50, 50));
            panel1.setMaximumSize(new Dimension(frame.getWidth(), 50));
            JPanel panel2 = new JPanel();
            panel2.setLayout(new BoxLayout(panel2, 0));
            panel2.setBackground(Color.orange);
            panel2.setMaximumSize(new Dimension(frame.getWidth(), frame.getHeight()));
            JLabel label2 = new JLabel("Hello world!");
            label2.setFont(new Font(Font.SERIF, Font.PLAIN , 30));
            JPanel panel3 = new JPanel();
            panel3.setBackground(Color.pink);
            panel3.setMaximumSize(new Dimension(100, frame.getHeight()));
            JLabel label = new JLabel("Hello world!");
            JButton btn = new JButton("I\'m button");
            btn.addActionListener(e -> {
                isVisible = !isVisible;
                label2.setVisible(isVisible);
            });

            frame.add(panel1);
            panel2.add(panel3);
            panel2.add(label2);
            panel3.add(label);
            panel3.add(btn);
            frame.add(panel2);
            // frame.add(label);
            // frame.add(btn);

            frame.setVisible(true);
        });
    }
}
