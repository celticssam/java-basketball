import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;


public class GamePanel extends JPanel implements KeyListener{
  //fields
  private int x,i;
  private Image ball, hoop;
  private int velx, vely;
  private int ballX, ballY;
  private int lives, makes, misses;
  private boolean MOVING, ENDOFGAME, RESTART;
  
  
  
  
  public GamePanel (Image ball, Image hoop){
  
