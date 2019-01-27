package functiongraphs;

import java.util.ArrayList;

/**
 *
 * Group: Elgie, Morby, Peacock
 * 
 * Absolute function class for FunctionGraph
 * 
 * 
 * USES FORM a|kx+d|+c
 * 
 * Holds, calculates points in an absolute function
 * 
 * FunctionGraph is a program that will graph a variety of functions for visualization and to express the characterstics of the equation
 * 
 * 
 * 
 * 
 * 
 */
public class Absolute extends Function {
    
    //CONSTRUCTOR
    public Absolute(double inA, double inK, double inD, double inC){
        super(inA,inK,inD,inC);
        
    }
    
    //METHODS
    protected CartesianPoint calculatePoint(double x){ //Calculates a point given x coordinate
        
        double translatedX; //X after k,d transforms
        translatedX = x * this.k;
        translatedX += d;
        
        return new CartesianPoint(x,a * Math.abs(translatedX) + c); //Apply function and A/C transforms to point, return it as CartesianPoint
    }
    
    
}
