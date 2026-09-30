package Mandiri;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JavaxSwingGridBagLayout {
    public static void main(String[] args) {
        System.out.println("Swing start");
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Demo Window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // frame.setPreferredSize(new Dimension(300, 300));
            // frame.setMinimumSize(new Dimension(100, 100));
            frame.setMinimumSize(new Dimension(600, 600));
            // frame.setMaximumSize(new Dimension(200, 200));
            frame.setLocationRelativeTo(null);
            frame.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();

            JPanel panel1 = new JPanel();
            panel1.setPreferredSize(new Dimension(50, 50));
            // panel1.setMinimumSize(new Dimension(50, 50));
            // panel1.setMaximumSize(new Dimension(100, 100));
            // panel1.setSize(new Dimension(50, 50));
            panel1.setBackground(Color.RED);
            gbc.gridx = 0;
            gbc.gridy = 0;
            // gbc.anchor = gbc.NORTHEAST;
            frame.add(panel1, gbc);
            
            JPanel panel2 = new JPanel();
            panel2.setPreferredSize(new Dimension(50, 50));
            panel2.setBackground(Color.BLUE);
            gbc.gridx = 1;
            gbc.gridy = 1;
            // gbc.gridheight = 1;
            frame.add(panel2, gbc);
            
            JPanel panel3 = new JPanel();
            panel3.setPreferredSize(new Dimension(50, 50));
            panel3.setBackground(Color.PINK);
            gbc.gridx = 2;
            gbc.gridy = 2;
            // gbc.gridheight = 1;
            // gbc.fill = GridBagConstraints.BOTH;
            frame.add(panel3, gbc);

            frame.setVisible(true);
        });
    }
}
