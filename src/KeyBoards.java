
import javax.imageio.IIOException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.sql.SQLOutput;


public class KeyBoards implements KeyListener {
    private MainScene mainScene;
    public KeyBoards(MainScene mainScene){
     this.mainScene = mainScene;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT -> {this.mainScene.moveCannon(14);}
            case KeyEvent.VK_RIGHT -> {this.mainScene.moveCannon(-14);}
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
