package UI;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Renderer extends JFrame {
	public Renderer() {
        initUI(2);
    }

    private void initUI(int scale) {

        add(new Board());

        setSize(900*scale, 500*scale);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            Renderer ex = new Renderer();
            ex.setVisible(true);
        });
        
    }
}
