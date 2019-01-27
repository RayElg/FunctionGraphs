/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functiongraphs;

import java.util.ArrayList;

/**
 *
 * Group: Elgie, Morby, Peacock
 * 
 * TrigFunction is an  Abstract class for FunctionGraph
 * 
 * FunctionGraph is a program that will graph a variety of functions for visualization and to express the characterstics of the equation
 * 
 */
public abstract class TrigFunction extends Function{
    //VARIABLES
    protected double period;
    
    
    
    public TrigFunction(double inA, double inK, double inD, double inC){
        // enters fields required for base Function
        super(inA, inK, inD, inC);
        // double a is used as the vertical stretch/amplitude
        // double k is used as the horizontal stretch/for period
        // double d is used as the horizontal translation
        // double c is used as the vertical translation
        
        
    }
    
    
    // output arraylist of CartesianPoint objects which will assis in drawing the function
    // idea is it will calculate its main period and save points, when drawing it it will
    // draw first period, and then add period value so it draws a second one to the left or
    // subtract it to the right
   public ArrayList <CartesianPoint> calculatePeriod(){
        // stores points to be returned to fill a permanent ArrayList
        ArrayList <CartesianPoint> tempList = new ArrayList();
        boolean cycle = false;
        
        double x = 0 + this.d;
        double main = (period/4) + this.d; // this value is used to find the four main points (start of period, first max/min, centre point, second max/min, end point
        
        
        // calculates main points( vertexs, midpoints, start end points)
        while(cycle == false){
            // once x is greater than the period we have done all th points we need
            if ( x > period){
                cycle = true;   
            }
            
            tempList.add(this.calculatePoint(x));
            
            x += main;
        }
        // reset x
        x = tempList.get(0).getX();
        
        for (int i = 0 ; i < 3 ; i++ ){
            
            
            for (double j = x + (main * i) ; j < main * i + main ; j += (0.1/(this.a*this.a))){
                tempList.add(this.calculatePoint(j));
            
            }
                
        }
        
        return tempList;
    }
    
    
    
}
