
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics; 

public class HoosiersScaleViewer extends JComponent {
  public static void main(String[] args) {
    JFrame frame = new JFrame(); 
    frame.setVisible(true); 
    int width = 500, height = 500;
    frame.setSize(width + 20, height + 40); 
    HoosiersScaleViewer drawing = new HoosiersScaleViewer(width, height); 
    frame.add(drawing);     
  }
  int width, height; 
  HoosiersScale a, b, c; 
  public HoosiersScaleViewer(int width, int height) {
    this.width = width;
    this.height = height; 
    a = new HoosiersScale( 20,  50, .2);         
    b = new HoosiersScale(220,  20, 0.5);         
    c = new HoosiersScale( 40, 230, 0.4);         
  }
  public void paintComponent(Graphics g) {
    a.draw(g); 
    b.draw(g); 
    c.draw(g); 
  }
}