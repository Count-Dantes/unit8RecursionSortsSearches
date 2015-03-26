//********************************************************************
//  KhPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Ko             Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;

public class FractalTreePanel extends JPanel
{
   private final int PANEL_WIDTH = 800;
   private final int PANEL_HEIGHT = 800;

   private final int TOPX = 400, TOPY = 500;
   private final int BOTX = 400, BOTY = 700;


   private int current; //current order

   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public FractalTreePanel (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
   public void drawFractal (int order, int x1, int y1, int x2, int y2, double prevTheta,
                            double theta,      
                            Graphics page)
   {
      int lastDeltaX, lastDeltaY, leftDeltaX, leftDeltaY, rightDeltaX,
            rightDeltaY, length, x3, y3, x4, y4;
      double rightTheta, leftTheta;

      if (order == 1)
         page.drawLine (x1, y1, x2, y2);
      else
      {
         lastDeltaX = x2 - x1;
         lastDeltaY = y2 - y1;
         length = (int)( Math.sqrt( lastDeltaX*lastDeltaX + lastDeltaY*lastDeltaY)*.70 );
         
         rightTheta = prevTheta + theta + Math.toRadians(10);
         leftTheta = prevTheta- theta  + Math.toRadians(10);

         rightDeltaX =(int) (length*Math.sin(rightTheta));
         rightDeltaY = (int) (length*Math.cos(rightTheta));
         
         leftDeltaX =(int) (length*Math.sin(leftTheta));
         leftDeltaY = (int) (length*Math.cos(leftTheta));

         x3 = x2 + rightDeltaX;
         y3 = y2 - rightDeltaY;
         
         x4 = x2 + leftDeltaX;
         y4 = y2 - leftDeltaY;
         
         page.drawLine (x2, y2, x3, y3);
         page.drawLine (x2, y2 , x4, y4);

         drawFractal (order-1, x2, y2, x3, y3, rightTheta, theta, page);
         drawFractal (order-1, x2, y2, x4, y4, leftTheta, theta, page);
      }
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);
      page.setColor (Color.green);

      drawFractal(current, TOPX, TOPY, BOTX, BOTY, Math.toRadians(0),
      Math.toRadians(30.0), page);
   }

   //-----------------------------------------------------------------
   //  Sets the fractal order to the value specified.
   //-----------------------------------------------------------------
   public void setOrder (int order)
   {
      current = order;
   }

   //-----------------------------------------------------------------
   //  Returns the current order.
   //-----------------------------------------------------------------
   public int getOrder ()
   {
      return current;
   }
}
