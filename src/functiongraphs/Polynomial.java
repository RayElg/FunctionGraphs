package functiongraphs;

import java.util.ArrayList;

/**
 *
 * Group: Elgie, Morby, Peacock
 * 
 * Polynomial function class for FunctionGraph
 * 
 * 
 * USES FORM a(kx+d)^E+c
 * 
 * calculates points in a polynomial function
 * 
 * FunctionGraph is a program that will graph a variety of functions for visualization and to express the characterstics of the equation
 * 
 * 
 */
public class Polynomial extends Function {
    double e; //The exponent
    
    
    //CONSTRUCTOR
    public Polynomial(double inA, double inK, double inD, double inC, double inE){ //Where E is exponent
        super(inA,inK,inD,inC);
        this.e = inE;
    }
    
    //METHODS
    protected CartesianPoint calculatePoint(double x){ //Calculates a point given x coordinate
        
        double translatedX; //X after k,d transforms
        translatedX = x * this.k;
        translatedX += d;
        
        return new CartesianPoint(x,a *  Math.pow(translatedX, e) + c); //Return CartesianPoint of this polynomial at x
    }
    
    public ArrayList<String> propertiesStrings() { //An ArrayList of strings showing the properties of this functio
        //Just the four standard properties of any equation, the translations
        ArrayList<String> toReturn = new ArrayList<>();

        toReturn.add("Vertical Stretch/Compress: " + this.a);  //Add different strings describing translations
        toReturn.add("Horizontal Stretch/Compress: " + this.k);  //Add different strings describing translations
        toReturn.add("Vertical Translate: " + this.c);  //Add different strings describing translations
        toReturn.add("Horizontal Translate: " + this.d);  //Add different strings describing translations

        toReturn.add("Y-Intercept: " + this.calculatePoint(0)); //Add string about y-int

        //With vertex/Inflection point
        //Vertex x = (-1 * d / k)
        //Vertex y = c
        
        toReturn.add("Vertex/Inflection Point: " + (-1 * this.d / this.k) + "," + (this.c));
        
        return toReturn;
    }
    
}