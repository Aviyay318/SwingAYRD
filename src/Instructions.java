import javax.swing.*;
import java.awt.*;

public class Instructions extends Screens {
    private JLabel instructions;
    public Instructions(int x, int y,int width, int height){
        this.setBounds(x,y,width,height);
        this.setLayout(null);
        this.setBackground(Color.green);
        this.setVisible(true);


        this.instructions = new JLabel("Setting");
        this.instructions.setBounds(50,50,200,50);
        this.add(this.instructions);


        this.setBounds(x, y, width, height);
        this.addBackHome(this);
        this.addPic();
    }
}
