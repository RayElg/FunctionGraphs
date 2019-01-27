package functiongraphs;

/**
 *
 * Group: Elgie, Morby, Peacock
 * 
 * Exponential function class for FunctionGraph
 * 
 * 
 * USES FORM a(b^(kx+d))+c;
 * 
 * calculates points in a polynomial function
 * 
 * FunctionGraph is a program that will graph a variety of functions for visualization and to express the characterstics of the equation
 * 
 * 
 */

public class Exponential extends Function{
    //VARIABLES
    double base; //Base to the n
    
    //CONSTRUCTOR
    public Exponential(double a, double k, double d, double c, double b){ //AKDC and Base
        super(a,k,d,c);
        this.base = b; //Assign base
    }
    
    //METHODS
    public CartesianPoint calculatePoint(double x){
        double translatedX = x * k + d;
        
        return new CartesianPoint(x,a * (Math.pow(base, x)) + c); //Return cartesian point corresponding to x value
    }
    
}
