

package functiongraphs;

import java.util.ArrayList;

/**
 *
 * Group: Elgie, Morby, Peacock
 * 
 * Exponential function class for FunctionGraph
 * 
 * 
 * USES FORM a(logb(kx+d))+c;
 * 
 * calculates points in a logarithm function
 * 
 * FunctionGraph is a program that will graph a variety of functions for visualization and to express the characterstics of the equation
 * 
 * 
 */

public class Logarithm extends Function{
    //VARIABLES
    double base; //Base. Logb(x)
    double asymptote = 0;
    
    //CONSTRUCTOR
    public Logarithm(double a, double k, double d, double c, double b){ //AKDC and Base
        super(a,k,d,c);
        this.base = b; //Assign base
        asymptote = -d;
        
    }
    
    //METHODS
    public CartesianPoint calculatePoint(double x){
        double translatedX = x * k + d;
        
        if (x <= asymptote && this.k > 0){ //If we would be calling Log with 0 or less
             return new CartesianPoint(x,Double.MAX_VALUE);
            //Just return a different point
        }else if(x >= asymptote && this.k < 0){
            return new CartesianPoint(x,Double.MAX_VALUE);
        }
        
        //Use the identity "logb(n) = log(n) / log(b)" where log() uses e as base
        return new CartesianPoint(x,a * (Math.log(translatedX)/Math.log(base)) + c); //Return cartesian point corresponding to x value
    }
    
    //Different propertiesString(); due to possibility of no y-int
    public ArrayList<String> propertiesStrings() { //An ArrayList of strings showing the properties of this functio
        //Just the four standard properties of any equation, the translations
        ArrayList<String> toReturn = new ArrayList<>();

        toReturn.add("Vertical Stretch/Compress: " + this.a);  //Add different strings describing translations
        toReturn.add("Horizontal Stretch/Compress: " + this.k);  //Add different strings describing translations
        toReturn.add("Vertical Translate: " + this.c);  //Add different strings describing translations
        toReturn.add("Horizontal Translate: " + this.d);  //Add different strings describing translations

        if(asymptote < 0){ //If there is a point at 0
            toReturn.add("Y-Intercept: " + this.calculatePoint(0)); //Add string about y-int
        } else {
            toReturn.add("Y-Intercept: None");
        }
        
        toReturn.add("Asymptote: " + this.asymptote + " <= x");

        return toReturn;
    }
}
