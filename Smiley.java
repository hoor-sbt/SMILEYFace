
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Smiley extends JPanel{

  public void paint (Graphics g){
      super.paint(g);
      
      //oval for the face
   
      g.setColor(Color.yellow);
      g.fillOval(10, 10, 200, 200);
      
      
      //oval for the eyes
      //with black color filled
      g.setColor(Color.BLACK);
      g.fillOval(55, 65, 30, 30);
      g.fillOval(135, 65, 30, 30);
    
      g.fillOval(50, 110, 120, 60);
      
      g.setColor(Color.yellow);
      g.fillRect(50, 110, 120, 30);
      g.fillOval(50, 120, 120, 40);
  }
    
}
