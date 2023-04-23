import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screens extends JPanel {
    private BufferedImage backGround;
    private BufferedImage cloud1;
    private BufferedImage cloud2;
    private int xPic;

    private JButton backHome;
public Screens(){
this.setLayout(null);
this.xPic=100;
}


public void addPic(){
    try {
        this.backGround = ImageIO.read(new File("models/backGround.jpg"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    try {
        this.cloud1 = ImageIO.read(new File("models/cloud1.png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    try {
        this.cloud2 = ImageIO.read(new File("models/cloud2.png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public void addBackHome(Screens screens){
    this.backHome = new JButton("Back Home");
    this.backHome.setBounds(10,10,100,30);
    this.add(this.backHome);
    this.backHome.addActionListener(e->{
        screens.setVisible(false);
        Constants.HOME_PAGE.setVisible(true);
    });
}
public void moveCloud(){
    new Thread(()->{
      while (true){
          try {
              Thread.sleep(4000);
              this.xPic+=15;
              repaint();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
    }).start();
}

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.drawImage(this.backGround,0,0,Constants.WIDTH,Constants.HEIGHT,null);
        graphics2D.drawImage(this.cloud1,this.xPic,100,200,200,null);
        graphics2D.drawImage(this.cloud2,this.xPic+200,10,200,200,null);
       // moveCloud();
    }
}
