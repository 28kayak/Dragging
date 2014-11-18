

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComponent;

/**
 *
 * @author Ahmad
 */
public class ShapeComponent extends JComponent {
  
  private CompoundShape shape;
  private Point mousePoint;
  
  
  
  public ShapeComponent(int x, int y, int width) {
    
    shape = new MyCompoundShape(x, y, width);
    
    addMouseListener(new MouseAdapter() {
      
      @Override
      public void mousePressed(MouseEvent event) {
        
        mousePoint = event.getPoint();
        
        if (!shape.contains(mousePoint))
          mousePoint = null;
      }
    });
    
    
    addMouseMotionListener(new MouseMotionAdapter() {
      
      @Override
      public void mouseDragged(MouseEvent event) {
        
        if (mousePoint == null) return;
        
        Point lastMousePoint = mousePoint;
        mousePoint = event.getPoint();
        double dx = mousePoint.getX() - lastMousePoint.getX();
        double dy = mousePoint.getY() - lastMousePoint.getY();
        shape.translate((int) dx, (int) dy);
        repaint();
      }
      
    });
    
  } //constructor
  
  
  @Override
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    shape.draw(g2);
  } //method
  
} //class
