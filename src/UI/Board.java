package UI;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JPanel;

import Engine.Ball;
import Engine.Vector2;

public class Board extends JPanel {
    Ball gameBall;
    Graphics2D g2d;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawDonut(g);
    }

    public void RunThread() {
        TestRun my = new TestRun();
        Thread t = new Thread(my);
        t.start();
    }

    private void drawDonut(Graphics g) {

        g2d = (Graphics2D) g;

        RenderingHints rh
                = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

//        gameBall = new Ball();
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(Color.gray);
        g2d.draw(gameBall.getShape());
//        gameBall.position = new Vector2(100,100);
//        gameBall.updateShape();
//        g2d.draw(gameBall.getShape());
    }

    class TestRun implements Runnable {

        @Override
        public void run() {
            gameBall = new Ball();
            while (true) {
                gameBall.nextPosition(new Vector2(1800, 1000));
                gameBall.updateShape();
                updateUI();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
