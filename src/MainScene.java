import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainScene extends Screens {

    private BufferedImage cannon;
    private int xPic;
    private int yPic;


    public MainScene(int x, int y, int width, int height) {



        this.setBounds(x, y, width, height);
        this.addBackHome(this);

       this.addPic();

        try {
            this.cannon = ImageIO.read(new File("models/cannon2.png"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        this.xPic = 450;
        this.yPic = 550;

        this.setFocusable(true);
        this.requestFocus(true);
        addKeyListener(new KeyBoards(this));
        addMouseListener(new MouseInput());
        //  this.moveCloud();
    }


    public void moveCannon(int x){
       if (this.xPic+x>=0&&this.xPic+x<=960){
           this.xPic-=x;
       }
      repaint();
    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.drawImage(this.cannon,this.xPic,this.yPic,150,150,null);
    }
}
