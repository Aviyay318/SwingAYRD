import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HomePage extends Screens {
    private JLabel welcome;
    private JLabel credit;
    private JButton start;
    private JButton score;
    private JButton setting;
    private JButton instructions;

    private Button button;
    private BufferedImage bufferedImage;
    //TO DO extend all pages
    public HomePage(int x,int y,int width, int height){
       this.setBounds(x,y,width,height);
       this.setLayout(null);
       this.setBackground(Color.BLUE);
       this.setVisible(true);


        try {
            this.bufferedImage = ImageIO.read(new File("icons/play.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
     this.addPic();

    this.button = new Button(0,0,100,100,this.bufferedImage);
        this.add(this.button);
        this.button.addActionListener(e -> {
            this.setVisible(false);
            Constants.MAIN_SCENE.setVisible(true);
        });
        this.welcome = new JLabel("Welcome Ball Blast");
       this.welcome.setFont(new Font("ariel",30,30));
       this.welcome.setBounds(400,50,400,50);
       this.add(this.welcome);

//       this.start = new JButton("Start");
//       this.start.setBounds(430,130,200,100);
//       this.add(this.start);

        this.score = new JButton("Score");
        this.score.setBounds(430,this.button.getY()+this.button.getHeight()+25,200,100);
        this.add(this.score);
        this.score.addActionListener(e->{
            this.setVisible(false);
            Constants.MAIN_SCENE.setVisible(false);
            Constants.SETTING.setVisible(false);
            Constants.SCORE.setVisible(true);
        });


        this.setting = new JButton("Setting");
        this.setting.setBounds(430,this.score.getY()+this.score.getHeight()+25,200,100);
        this.add(this.setting);
        this.setting.addActionListener(e->{
            this.setVisible(false);
            Constants.MAIN_SCENE.setVisible(false);
            Constants.SETTING.setVisible(true);
        });


        this.instructions = new JButton("Instructions");
        this.instructions.setBounds(430,this.setting.getY()+this.setting.getHeight()+25,200,100);
        this.add(this.instructions);
        this.instructions.addActionListener(e->{
            this.setVisible(false);
            Constants.MAIN_SCENE.setVisible(false);
            Constants.SETTING.setVisible(false);
            Constants.SCORE.setVisible(false);
            Constants.INSTRUCTIONS.setVisible(true);
        });



        this.credit = new JLabel("CREDIT: AYRD");
        this.credit.setFont(new Font("ariel",30,30));
        this.credit.setBounds(430,this.instructions.getY()+this.instructions.getHeight()+35,300,100);
        this.add(this.credit);
//       this.start.addActionListener(e->{
//           this.setVisible(false);
//           Constants.MAIN_SCENE.setVisible(true);
//       });
    }
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
            Graphics2D graphics2D = (Graphics2D) graphics;
            graphics2D.drawImage(this.bufferedImage,this.button.getX(),this.button.getY(),100,100,null);
        }
}
