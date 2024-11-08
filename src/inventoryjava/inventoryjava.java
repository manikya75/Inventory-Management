/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventoryjava;
//
///**
// *
// * @author manik
// */
//public class inventoryjava {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inventoryjava extends JFrame {

    public inventoryjava() {
        initUI();
    }

    private void initUI() {
        JButton fullScreenButton = new JButton("Toggle Fullscreen");
        fullScreenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleFullScreen();
            }
        });

        setLayout(new FlowLayout());
        add(fullScreenButton);

        setTitle("Fullscreen Swing App");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void toggleFullScreen() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();

        if (gd.getFullScreenWindow() == null) {
            // Enter fullscreen mode
            setUndecorated(true);
            gd.setFullScreenWindow(this);
        } else {
            // Exit fullscreen mode
            setUndecorated(false);
            gd.setFullScreenWindow(null);
        }

        // Repaint the content pane
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                inventoryjava app = new inventoryjava();
                app.setVisible(true);
            }
        });
    }
}
