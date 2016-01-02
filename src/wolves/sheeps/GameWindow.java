package wolves.sheeps;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import wolves.sheeps.GPar;

import java.awt.*;

public class GameWindow extends JFrame {

    Login l = new Login();
    GPar gp = new GPar();

    public GameWindow(){
        setSize(1200,1000);
        setVisible(true);
        setTitle("Wilk i Owce");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        l.Labels();
        getContentPane().add(l.name);

        l.JTextField();
        getContentPane().add(l.tname);

        l.JButton();
        getContentPane().add(l.accept);

        repaint();
    }
    private void initGUI(){
        setLayout(new GridLayout(1,1));
        GPar.loadInitialImages();
        Toolkit tk = Toolkit.getDefaultToolkit();
        //ustaw kursor myszki w ksztaĹ‚cie tarczy
        Cursor tCursor = tk.createCustomCursor(GPar.cursorImage, new Point(10,10), "Target Cursor");
        setCursor(tCursor);
        //((Component)screen.getFullScreenWindow()).setCursor(tCursor);
        add(new GPar());
    }
}

