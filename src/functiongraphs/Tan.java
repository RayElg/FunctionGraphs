/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functiongraphs;

/*
 *
 *
 * Group: Elgie, Morby, Peacock
 * 
 * Tan function class for FunctionGraph
 * 
 * 
 * USES FORM a tan(kx+d)+c
 * 
 * Holds, calculates points in an Tan function
 * 
 * FunctionGraph is a program that will graph a variety of functions for visualization and to express the characterstics of the equation
 * 
 */
public class Tan extends TrigFunction{
    // VARIABLES
    //---------------------------------------------------------------------------
    
    
    //CONSTRUCTOR
    //---------------------------------------------------------------------------
    public Tan(double inA, double inK, double inD, double inC){
        super(inA, inK, inD, inC);
        // sets peroid
        this.period = Math.PI/this.k;
        
    }
    
    //METHODS
    //---------------------------------------------------------------------------
    public CartesianPoint calculatePoint(double X){
        // variables
        double translatedX;
        double Y;
        // calculates translated x
        translatedX = (this.k*X) + this.d;
        // calculates y based off translatedX
         Y = ( this.a * Math.tan(translatedX)) + this.c;
        
        
        CartesianPoint temp = new CartesianPoint( X, Y);
        
        return temp;
    }
    
     
}
