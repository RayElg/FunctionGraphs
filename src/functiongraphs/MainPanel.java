package functiongraphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import javax.swing.JPanel;

/**
 *
 * Group: Elgie, Morby, Peacock
 *
 * Main view for FunctionGraph, will graph the functions
 *
 * FunctionGraph is a program that will graph a variety of functions for
 * visualization and to express the characterstics of the equation
 *
 */
public class MainPanel extends JPanel {

    //VARS
    double minX = 0; //Minimum x value to draw
    double maxX = 50; //Maximum x value to draw
    double minY = -3; //Minimum y value to draw
    double maxY = 3; //Maximum y value to draw

    //The location of the initial button press
    int initialX, initialY;

    DecimalFormat df = new DecimalFormat("#.####"); //How much we'll round things to
    
    //CONSTRUCTOR
    public MainPanel() {

        addMouseListener(new MouseAdapter() { //Mouse listener
            public void mousePressed(MouseEvent e) { //When someone clicks down on the panel
                clickDown(e);
            }

           
            
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                mouseDrag(e);
            }
        });

    }

    //METHODS
    //Someone clicked the JPanel
    public void clickDown(MouseEvent e) {
        //Record location of click down
        initialX = e.getX();
        initialY = e.getY();
    }

    //Someone dragged the JPanel
    public void mouseDrag(MouseEvent e) {

        //Dimensions of panel
        double thisHeight = (double) this.getHeight();
        double thisWidth = (double) this.getWidth();

        //Find total differences
        double xTotal = maxX - minX;
        double yTotal = maxY - minY;
        //Find each pixel's "fraction" or ratio
        double pixelRatioX = ((double) 1 / thisWidth) * (double) xTotal; //Fraction of one pixel on screen multiplied by range on screen
        double pixelRatioY = ((double) 1 / thisHeight) * (double) yTotal;
        
        //Record location at unclick
        int finalX = e.getX();
        int finalY = e.getY();

        //Find difference in mouse drag
        int deltaX = finalX - initialX;
        int deltaY = finalY - initialY;

        //Move the maxX, minX by pixels distance, multiplied by true distance on cartesianPlane
        minX += -1 * deltaX * pixelRatioX;
        maxX += -1 * deltaX * pixelRatioX;
        minY += deltaY * pixelRatioY;
        maxY += deltaY * pixelRatioY;
        //Reset location of the initial
        initialX = e.getX();
        initialY = e.getY();

        //Repaint
        this.repaint();

    }

    //PAINT METHOD
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        checkZoom(); //Check if Gui has zoomed in/out
        roundNums(); //Round the numbers to four decimal places

        drawOrigin(g); //Draw the origin lines

        // Draw Text
        //g.drawString("Test Succesful",10,20);
        drawAxis(g);

        for (int i = 0; i < FunctionGraphs.functions.size(); i++) { //Draw all the functions
            drawFunc(g, FunctionGraphs.functions.get(i));
        }

    }
    
    private void roundNums(){ //Round max, min values
        
        
        
        //Round the numbers
        maxY = Double.parseDouble(df.format(maxY));
        minY = Double.parseDouble(df.format(minY));
        maxX = Double.parseDouble(df.format(maxX));
        minX = Double.parseDouble(df.format(minX));
        
    }

    private void checkZoom() {
        if (Gui.zoomFactor > 0) { //Zoom in
            if (maxX - minX > 3) { //If not already max zoomed in
                maxX *= 0.8;
                minX *= 0.8;
                maxY *= 0.8;
                minY *= 0.8;
                //Zoom in by 80 percent
            }
        } else if (Gui.zoomFactor < 0) { //Zoom out
            maxX *= 1.2;
            minX *= 1.2;
            minY *= 1.2;
            maxY *= 1.2;
            //Zoom out by 20 percent
        }

        Gui.zoomFactor = 0;
    }

    //DRAW AXIS
    private void drawAxis(Graphics g) {
        //Draw X coords along top of panel
        g.drawLine(0, 0, 0, 15);
        g.drawString(minX + "", 3, 9);

        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, 15);
        g.drawString(df.format((minX + maxX) / 2) + "", this.getWidth() / 2 + 3, 9);

        g.drawLine(this.getWidth() - 1, 0, this.getWidth() - 1, 15);
        g.drawString(maxX + "", this.getWidth() - 30, 9);

        //Draw Y coords along side of panel
        g.drawLine(0, this.getHeight() - 1, 15, this.getHeight() - 1);
        g.drawString(minY + "", 0, this.getHeight() - 6);

        g.drawLine(0, this.getHeight() / 2, 15, this.getHeight() / 2);
        g.drawString(df.format((minY + maxY) / 2) + "", 0, this.getHeight() / 2 - 3);
    }

    public void drawFunc(Graphics g, Function f) {

        double xTotal; //Total difference xMax -> xMin
        double yTotal; //Total difference yMax -> yMin
        CartesianPoint p;
        double PixelY;

        //Ratio of each pixel to cartesian point
        double pixelRatioX;
        double pixelRatioY;

        //Dimensions of panel
        double thisHeight = (double) this.getHeight();
        double thisWidth = (double) this.getWidth();

        //Find total differences
        xTotal = maxX - minX;
        yTotal = maxY - minY;
        //Find each pixel's "fraction" or ratio
        pixelRatioX = ((double) 1 / thisWidth) * (double) xTotal; //Fraction of one pixel on screen multiplied by range on screen
        pixelRatioY = ((double) 1 / thisHeight) * (double) yTotal;

        //Step through each pixel on the panel, x wise
        for (double PixelX = 0; PixelX < thisWidth; PixelX += 0.01) {

            //Find what cartesian point to calculate...
            p = f.calculatePoint((double) PixelX * pixelRatioX + minX);

            //Where we'll draw the pixel, y-wise
            //First, get the distance from the minimum value
            PixelY = p.y - minY;
            PixelY /= yTotal; //Now fraction of the way through yTotal
            PixelY = thisHeight - PixelY * thisHeight; //Finally the location on screen

            if (PixelY < Integer.MAX_VALUE && PixelY > Integer.MIN_VALUE) {
                g.setColor(f.drawColor); //Set the color
                g.drawRect((int) PixelX, (int) PixelY, 1, 1); //Draw the point
                g.setColor(Color.BLACK); //Set color back
            }

        }
    }

    public void drawOrigin(Graphics g) {
        //Dimensions of panel
        double thisHeight = (double) this.getHeight();
        double thisWidth = (double) this.getWidth();

        double distanceIn; //The distance on cartesianPlane 0 is from the edge

        //Draw y line
        if (maxX > 0 && minX < 0) { //If x=zero is onscreen
            distanceIn = 0 - minX;
            distanceIn /= (maxX - minX); //Now distance in terms of fraction of the total
            distanceIn = distanceIn * thisWidth; //Now where it is on screen

            g.drawLine((int) distanceIn, 0, (int) distanceIn, (int) thisHeight);

        }

        //Draw x line
        if (maxY > 0 && minY < 0) { //If x=zero is onscreen
            distanceIn = 0 - minY;
            distanceIn /= (maxY - minY); //Now distance in terms of fraction of the total
            distanceIn = thisHeight - distanceIn * thisHeight; //Now where it is on screen

            g.drawLine(0, (int) distanceIn, (int) thisWidth, (int) distanceIn);

        }

    }

}
