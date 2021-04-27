








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
