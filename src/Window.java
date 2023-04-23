import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {
    private Image icon;

    public Window() {
        try {
            this.icon = ImageIO.read(new File("models/icon.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setIconImage(this.icon);
        this.setSize(Constants.WIDTH, Constants.HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Ball Blast");
        this.setLocationRelativeTo(null);
        this.add(Constants.HOME_PAGE);
        this.add(Constants.MAIN_SCENE);
        this.add(Constants.SETTING);
        this.add(Constants.SCORE);
        this.add(Constants.INSTRUCTIONS);

        this.setVisible(true);
    }


}
