import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Button extends JButton {
    private BufferedImage icon;
    public Button(int x, int y , int width, int height,BufferedImage icon){
       this.setBounds(x,y,width,height);
       this.icon  = icon;


    }
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.drawImage(this.icon,this.getX(),this.getY(),100,100,null);
    }
}
