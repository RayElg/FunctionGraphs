

package functiongraphs;

import java.util.ArrayList;

/**
 *
 * Group: Elgie, Morby, Peacock
 *
 * Linear function class for FunctionGraph
 *
 *
 * USES FORM a*(kx+d)+c
 *
 * calculates points in a linear function
 *
 * FunctionGraph is a program that will graph a variety of functions for
 * visualization and to express the characterstics of the equation
 *
 *
 */


public class Linear extends Function{
    //VARS
    
    
    //CONSTRUCTOR
    public Linear(double inA, double inK, double inD, double inC){
        super(inA,inK,inD,inC);
    }
    
    //METHODS
    public CartesianPoint calculatePoint(double x){
        double translatedX = this.k * x + this.d; //Apply k,d to x
        
        return new CartesianPoint(x, this.a * translatedX + c); //Return coordinate at f(x)
    }
    
    //Calculating the x-int of a linear is trivial and lightweight, so
    //Linear will calculate x-int in addition to report other characteristics
    public ArrayList<String> propertiesStrings() { //An ArrayList of strings showing the properties of this functio
        //Just the four standard properties of any equation, the translations
        ArrayList<String> toReturn = new ArrayList<>();

        toReturn.add("Vertical Stretch/Compress: " + this.a);  //Add different strings describing translations
        toReturn.add("Horizontal Stretch/Compress: " + this.k);  //Add different strings describing translations
        toReturn.add("Vertical Translate: " + this.c);  //Add different strings describing translations
        toReturn.add("Horizontal Translate: " + this.d);  //Add different strings describing translations

        //Add string about x-int
        //Rearranging 0 = f(x), we get
        //((-c/a)-d)/k = x
        toReturn.add("X-Intercept: " + ((- 1 * this.c/this.a) - this.d)/this.k);
        
        toReturn.add("Y-Intercept: " + this.calculatePoint(0)); //Add string about y-int

        return toReturn;
    }
    
}
