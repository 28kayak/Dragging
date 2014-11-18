

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Ahmad
 */
public class MyCompoundShape implements CompoundShape {

  private GeneralPath path = null;
  private int x;
  private int y;
  private final int width;
  
  
  MyCompoundShape(int x, int y, int width) {
    this.x = x;
    this.y = y;
    this.width = width;
  }


  @Override
  public void draw(Graphics2D g2) {
    
    Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, width);
    
    Point2D.Double start = new Point2D.Double(x, y);
    Point2D.Double end = new Point2D.Double(x + width, y);
    Shape segment = new Line2D.Double(start, end);
    
    g2.setColor(Color.RED);
    g2.fill(circle);
    g2.draw(segment);
    
    path = new GeneralPath();
    path.append(circle, false);
    path.append(segment, false);

    g2.draw(path);

  } //method
  


  @Override
  public boolean contains(Point point) {

    if (path == null) {
      return false;
    }

    return path.contains(point);

  } //method


  /**
   * Translates the current coordination x,y to x+dx and y+dy.
   *
   * @param dx - the movement amount of x
   * @param dy - the movement amount of y
   */
  @Override
  public void translate(int dx, int dy) {
    
    x += dx;
    y += dy;

  } //method


} //method
