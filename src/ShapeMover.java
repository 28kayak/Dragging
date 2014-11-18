

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Ahmad
 */
public class ShapeMover {
  
  private static final int FRAME_WIDTH  = 400;
  private static final int FRAME_HEIGHT = 400;
  private static final int SHAPE_WIDTH  = 50;
  private static final int INITIAL_X  = 50;
  private static final int INITIAL_Y  = 50;
  
  
  private JFrame frame;
  private ShapeComponent myShape;
  private JButton ball;
  private JButton ract;
  
  
  
  private void initialSetUp() {
    
    myShape = new ShapeComponent(INITIAL_X, INITIAL_Y, SHAPE_WIDTH);
    
    frame = new JFrame();
    
    
    frame.add(myShape);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    frame.setVisible(true);
    
    
  } //method
  
  
  public static void main(String[] args) 
  {
    
    ShapeMover sm = new ShapeMover();
    sm.initialSetUp();
    
  } //main
  
} //class
