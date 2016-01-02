
package wolves.sheeps;

import java.awt.*;
import javax.swing.*;

public class GPar extends JPanel {
    public static Image bgImage, train, testYself, howToPlay, info, wolf, exit, menuGameImage, cursorImage;
    public static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }
    public static void loadInitialImages() {
        bgImage = loadImage("images/grass.jpg");
        train = loadImage("images/cwicz.png");
        testYself = loadImage("image/sprawdz_sie.png");
        howToPlay = loadImage("images/menu.jpg");
        info = loadImage("image/informacje_o_grze.png");
        menuGameImage = loadImage("images/gra_1024.png");
        cursorImage = loadImage("images/spider.png");
        wolf = loadImage("images/wolf.png");
        exit = loadImage("images/wyjdz.png");
    }
    public void DrawAll(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        loadInitialImages();
        g2d.drawImage(bgImage,0,0,this);
        setBounds(220, 50, 750, 600);
        setBackground(Color.LIGHT_GRAY);
        setVisible(true);
        g.setColor(Color.BLACK);
    }
}