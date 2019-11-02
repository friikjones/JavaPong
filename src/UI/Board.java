package UI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JPanel;

import Engine.Ball;
import Engine.Vector2;

public class Board extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawDonut(g);
    }

    private void drawDonut(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh
                = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        Ball gameBall = new Ball();
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(Color.gray);
        g2d.draw(gameBall.getShape());
        gameBall.position = new Vector2(100,100);
        gameBall.updateShape();
        g2d.draw(gameBall.getShape());
        
        
    }
}
