/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functiongraphs;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * Group: Elgie, Morby, Peacock
 */
public abstract class Function implements Serializable{

    // VARIABLES
    //------------------------------------------------------------------------------
    protected double a, k, d, c;
    // double a is used as the vertical stretch/amplitude
    // double k is used as the horizontal stretch/for period
    // double d is used as the horizontal translation
    // double c is used as the vertical translation
    public Color drawColor = Color.RED; //What color to draw this function on the canvas

    // CONSTRUCTOR
    //------------------------------------------------------------------------------

    public Function(double inA, double inK, double inD, double inC) {

        this.a = inA;
        this.k = inK;
        this.d = inD;
        this.c = inC;

    }

    // METHODS
    //----------------------------------------------------------------------------------
    abstract protected CartesianPoint calculatePoint(double x); //Abstract method for calculating a given point

    public ArrayList<String> propertiesStrings() { //An ArrayList of strings showing the properties of this functio
        //Just the four standard properties of any equation, the translations
        ArrayList<String> toReturn = new ArrayList<>();

        toReturn.add("Vertical Stretch/Compress: " + this.a);  //Add different strings describing translations
        toReturn.add("Horizontal Stretch/Compress: " + this.k);  //Add different strings describing translations
        toReturn.add("Vertical Translate: " + this.c);  //Add different strings describing translations
        toReturn.add("Horizontal Translate: " + this.d);  //Add different strings describing translations

        toReturn.add("Y-Intercept: " + this.calculatePoint(0)); //Add string about y-int
        
        return toReturn;
    }

    //get methods
    //----------------------------------------------------------------------------------
    public double getA(double inA) {
        return this.a;
    }

    public double getK(double inK) {
        return this.k;
    }

    public double getD(double inD) {
        return this.d;
    }

    public double getC(double inC) {
        return this.c;
    }


    //set methods
    //----------------------------------------------------------------------------------
    public void setA(double inA) {
        this.a = inA;
    }

    public void setK(double inK) {
        this.k = inK;
    }

    public void setD(double inD) {
        this.d = inD;
    }

    public void setC(double inC) {
        this.c = inC;
    }

}
