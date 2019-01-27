package functiongraphs;

import java.util.ArrayList;

/**
 *
 * Group: Elgie, Morby, Peacock
 * 
 * Rational function class for FunctionGraph
 * 
 * 
 * Just divides one function by another
 * 
 * calculates points in a rational function
 * 
 * FunctionGraph is a program that will graph a variety of functions for visualization and to express the characterstics of the equation
 * 
 * 
 */
public class Rational extends Function{
    
    //VARS
    Function numerator;
    Function denominator;
    ArrayList <CartesianPoint> Asymptotes = new ArrayList();
    
    
    //CONSTRUCTOR
    public Rational(Function inNum, Function inDen){
        super(0,0,0,0);//A,K,D,C incorrect for a rational
        //Assign values
        this.numerator = inNum;
        this.denominator = inDen;
    }
    
    
    //METHODS
    public CartesianPoint calculatePoint(double x){
        double y;
        //If denominator here != 0 (no hole)
        if(denominator.calculatePoint(x).getY() != 0){
            //Calculate point by dividing the value of the numerator here by the value of the denominator here
            y = numerator.calculatePoint(x).getY() / denominator.calculatePoint(x).getY();
        }else{
            //Since there's a hole or asymptote here, just return a minimum value
            y=Double.MAX_VALUE; //This won't be drawn
            Asymptotes.add(new CartesianPoint(x,1.0));
            return new CartesianPoint(x ,y); //Return the nearby point
        }
        return new CartesianPoint(x,y);
    }
    
    public ArrayList<String> propertiesStrings() { //An ArrayList of strings showing the properties of this functio
        //Just the four standard properties of any equation, the translations, for both num+den
        ArrayList<String> toReturn = new ArrayList<>();

        toReturn.add("Numerator:");
        toReturn.add("Vertical Stretch/Compress: " + this.numerator.a);  //Add different strings describing translations
        toReturn.add("Horizontal Stretch/Compress: " + this.numerator.k);  //Add different strings describing translations
        toReturn.add("Vertical Translate: " + this.numerator.c);  //Add different strings describing translations
        toReturn.add("Horizontal Translate: " + this.numerator.d);  //Add different strings describing translations

        toReturn.add("Denominator:");
        toReturn.add("Vertical Stretch/Compress: " + this.denominator.a);  //Add different strings describing translations
        toReturn.add("Horizontal Stretch/Compress: " + this.denominator.k);  //Add different strings describing translations
        toReturn.add("Vertical Translate: " + this.denominator.c);  //Add different strings describing translations
        toReturn.add("Horizontal Translate: " + this.denominator.d);  //Add different strings describing translations

        if (this.calculatePoint(0).x == 0) { //If there is a point at 0
            toReturn.add("Y-Intercept: " + this.calculatePoint(0)); //Add string about y-int
        }
        
        return toReturn;
    }
    

    
}
