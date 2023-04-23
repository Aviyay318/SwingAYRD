import javax.swing.*;
import java.awt.*;

    public class Setting extends Screens {
        private JLabel setting;
        public Setting(int x, int y,int width, int height){
            this.setBounds(x,y,width,height);
            this.setLayout(null);
            this.setBackground(Color.MAGENTA);
            this.setVisible(true);

            this.setting = new JLabel("Setting");
            this.setting.setBounds(50,50,200,50);
            this.add(this.setting);


            this.setBounds(x, y, width, height);
            this.addBackHome(this);
           this.addPic();
        }
}
