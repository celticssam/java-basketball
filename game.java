import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Game extends JFrame{

private Image hoop, basketballIcon;
private GamePanel game;
  
  
  public Game(){
    super("basketball game");
    hoop = new ImageIcon("Hoop.gif").getImage();
    BasketballIcon = new ImageIcon("basketballIcon.png").getImage();
    game = new GamePanel(baketballIcon, hoop);
    initialize();
  }
  
  private void initialize(){
    
    setSize(500,500);
    setLocationRelativeTo(null);
    setBackground(Color.green);
    setResizeable(true);
    addKeyListener(game);
    add(game);
    setDefaultCloseOperations(EXIT_ON_CLOSE);
    setVisible(true);
    setIconImage(baketballIcon);
    
    game.run();
    
  }
}
