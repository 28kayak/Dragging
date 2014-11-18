

import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author Ahmad
 */
public interface CompoundShape {
  
  void draw(Graphics2D g2);
  void translate(int dx, int dy);
  boolean contains(Point point);
  
} //interface
