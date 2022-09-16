import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class HoosiersScale {
  int x, y; 
  double scale; 
  public HoosiersScale(int x, int y, double scale) {
    this.x = x; 
    this.y = y; 
    this.scale = scale; 
  }
  private int scale(int size) {
    return (int)(this.scale * size); 
  }
  public void draw(Graphics g) {

	  g.setColor(new Color(154, 0, 0));
      g.fillRect(x + scale(210), y + scale(0), scale(80), scale(500));
      g.fillRect(x + scale(180), y + scale(0), scale(140), scale(40));
      g.fillRect(x + scale(180), y + scale(460), scale(140), scale(40));
      g.fillRect(x + scale(125), y + scale(315), scale(250), scale(85));
      g.fillRect(x + scale(350), y + scale(105), scale(75), scale(243)); 
      g.fillPolygon( new Polygon
                      (new int[] {x + scale(375), x + scale(350), x + scale(425)}, //320, 290, 365
                       new int[] {y + scale(400), y + scale(320), y + scale(348)},
                       3
                      )
                   );
      g.fillPolygon( new Polygon
              (new int[] {x + scale(125), x + scale(150), x + scale(75)}, //320, 290, 365
               new int[] {y + scale(400), y + scale(320), y + scale(348)},
               3
              )
           );
      g.fillRect(x + scale(75), y + scale(105), scale(75), scale(243));
      g.fillRect(x + scale(47), y + scale(70), scale(130), scale(40));
      g.fillRect(x + scale(322), y + scale(70), scale(130), scale(40));
      

  }
}
