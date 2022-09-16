
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class Hoosiers extends JComponent {
  int width, height;
  public Hoosiers(int width, int height) {
    this.width = width;
    this.height = height;
  }
  public void paintComponent(Graphics g) {

        g.setColor(new Color(154, 0, 0));
        g.fillRect(210, 0, 80, 500);
        g.fillRect(180, 0, 140, 40);
        g.fillRect(180, 460, 140, 40);
        g.fillRect(125, 315, 250, 85);
        g.fillRect(350, 105, 75, 243); 
        g.fillPolygon( new Polygon
                        (new int[] {375, 350, 425}, //320, 290, 365
                         new int[] {400, 320, 348},
                         3
                        )
                     );
        g.fillPolygon( new Polygon
                (new int[] {125, 150, 75}, //320, 290, 365
                 new int[] {400, 320, 348},
                 3
                )
             );
        g.fillRect(75, 105, 75, 243);
        g.fillRect(47, 70, 130, 40);
        g.fillRect(322, 70, 130, 40);
        

  }
}
