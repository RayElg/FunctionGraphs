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
 * Cos function class for FunctionGraph
 * 
 * 
 * USES FORM a cos(kx+d)+c
 * 
 * Holds, calculates points in an Cos function
 * 
 * FunctionGraph is a program that will graph a variety of functions for visualization and to express the characterstics of the equation
 * 
 */
public class Cos extends TrigFunction{
    // VARIABLES
    //---------------------------------------------------------------------------
    
    
    //CONSTRUCTOR
    //---------------------------------------------------------------------------
    public Cos(double inA, double inK, double inD, double inC){
        super(inA, inK, inD, inC);
        // sets peroid
        this.period = (2 * Math.PI)/this.k;
        
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
         Y = ( this.a * Math.cos(translatedX)) + this.c;
        
        
        CartesianPoint temp = new CartesianPoint( X, Y);
        
        return temp;
    }
    
    
}
