package com.jpowergrid.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LandingFrame extends JFrame {

    private class InnerPanel extends JComponent implements MouseListener{
public void mouseClicked(MouseEvent evt){
if(evt.getY() > 149){

}
}
public InnerPanel(){
    addMouseListener(this);
}
        public void paint(Graphics g0) {
            Graphics2D g = (Graphics2D) g0;
            g.setFont(new Font("times new roman", 0, 50));
            g.setColor(Color.RED);
            g.fillRect(0, 0, 300, 150);
            g.setColor(Color.GREEN);
            g.fillRect(0, 150, 300, 150);
            g.setColor(Color.RED);
            g.drawString("Play", 110, 240);
            g.setColor(Color.GREEN);
g.drawString("JPowerGrid", 35, 85);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    InnerPanel panel = new InnerPanel();

    public LandingFrame() {
        super("JPowerGrid - Landing");
        panel.setPreferredSize(new Dimension(300, 300));
        setContentPane(panel);

    }

    public void launch() {
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
