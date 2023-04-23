import javax.swing.*;
import java.awt.*;

    public class Score extends Screens {
        private JLabel score;

        public Score(int x, int y,int width, int height){
            this.setBounds(x,y,width,height);
            this.setLayout(null);
            this.setBackground(Color.pink);
            this.setVisible(true);
            this.setLayout(null);
            this.score = new JLabel("Score");
            this.score.setBounds(50,50,200,50);
            this.add(this.score);



            this.setBounds(x, y, width, height);
           this.addBackHome(this);
           this.addPic();
        }
}
