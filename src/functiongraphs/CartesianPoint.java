

package functiongraphs;

/**
 *
 * Group: Elgie, Morby, Peacock
 * 
 * CartesianPoint class for FunctionGraph
 * 
 * Stores data about a specific point, very simple
 * 
 * FunctionGraph is a program that will graph a variety of functions for visualization and to express the characterstics of the equation
 * 
 */
public class CartesianPoint {
    //VARS
    protected double x;
    protected double y;
    
    
    //CONSTRUCTOR
    public CartesianPoint(double inX, double inY){
        this.x = inX;
        this.y = inY;
    }
    
    //METHODS
    public String toString(){
        return this.x + "," + this.y;
    }
    
    
    //GETTERS
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    
    //SETTERS
    public void setX(double inX){
        this.x = inX;
    }
    public void setY(double inY){
        this.y = inY;
    }
    
}
