








public class Game extends JFrame{

private Image hoop, basketballIcon;
private GamePanel game;
  
  
  public Game(){
    super("basketball game");
    hoop = new ImageIcon("Hoop.gif").getImage();
    BasketballIcon = new ImageIcon("basketballIcon.png").getImage();
    game = new GamePanel(BasketballIcon, hoop);
    initialize();
  }
  
  private void initialize(){
    
    setSize(500,500);
    setLocationRelativeTo(null);
