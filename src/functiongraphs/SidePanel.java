/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functiongraphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SidePanel extends JPanel {
    //VARS

    //CONSTRUCTOR
    public SidePanel() {

        addMouseListener(new MouseAdapter() { //Mouse listener
            public void mouseReleased(MouseEvent e) { //When someone clicks on the panel
                click(e); //Call click
            }
        });
        
    }

    //METHODS
    //PAINT METHOD
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFuncs(g);
    }

    //DRAW THE FUNCTIONS
    public void drawFuncs(Graphics g) {
        //Draw all the functions to this panel
        for (int i = 0; i < FunctionGraphs.functions.size(); i++) {
            g.drawString(FunctionGraphs.functions.get(i).getClass().getSimpleName() + "", 1, (i + 1) * 15);
            g.setColor(FunctionGraphs.functions.get(i).drawColor);
            g.fillOval(80, (i + 1) * 15 - 9, 8, 8);
            g.setColor(Color.red);
            g.drawString("x", 65, (i+1)*15);
            g.setColor(Color.black);
        }
    }

    //When someone clicks on the panel
    protected void click(MouseEvent e) {
        
        int indexSelected = (e.getY() / 15);
        
        if (e.getX() > 70) { //If clicked near the color selector
            JFrame colorFrame = new JFrame("Choose color"); //Dialog for choosing color
            //Which one did they click on?

            if (indexSelected <= FunctionGraphs.functions.size() - 1) { //If they clicked on a function
                FunctionGraphs.functions.get(indexSelected).drawColor = JColorChooser.showDialog(colorFrame, "Choose Background Color", FunctionGraphs.functions.get(indexSelected).drawColor); //Open color chooser dialog
                this.repaint(); //Repaint panel
            }

        } else if (e.getX() < 70 && e.getX() > 60) { //If clicked near the x button
            //Which one did they click on?

            if (indexSelected <= FunctionGraphs.functions.size() - 1) { //If they clicked on a function
                FunctionGraphs.functions.remove(indexSelected); //Remove this one from the list
                this.repaint(); //Repaint panel
            }
        }
        
        //Select function (For properties strings)
            if (indexSelected <= FunctionGraphs.functions.size() - 1) { //If they clicked on a function
                Gui.funcSelected(indexSelected);
            }
        
        
        Gui.mainPanel.repaint();

    }
    
}
