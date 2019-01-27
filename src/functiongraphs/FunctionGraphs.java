package functiongraphs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Group: Elgie, Morby, Peacock
 * 
 * Main class for FunctionGraph
 * 
 * FunctionGraph is a program that will graph a variety of functions for visualization and to express the characterstics of the equation
 * 
 */ 
public class FunctionGraphs {
    
    //VARS
    public static ArrayList<Function> functions = new ArrayList<>(); //Where all the functions are held
    
    
    //MAIN
    public static void main(String[] args) {
        Gui g = new Gui(); //Open the jFrame

        
    }
    
    //TEST HARNESS
    public static void testHarness(){ //Test out Polynomial
        Polynomial p = new Polynomial(2,3,0,1,3); //Create new polynomial function a=2, k=3, d=0,c=1,e=3
        
        makePolynomial(2,3,0,1,3);
        
        for(double i = -5; i < 5; i += 0.1){ //iterate every 0.2 between -5 and 5
            System.out.println(getFunction(0).calculatePoint(i).toString()); //Output string for each point
        }
        
        System.out.println(getFunction(0).propertiesStrings());
        
    }
    
    
    //METHODS
    
    public static void makeNormalFunc(String type, double inA, double inK, double inD, double inC){ //Called when adding a function using a,k,d,c
        //Go through types of functions
        switch (type) {
            case "Abs":
                Absolute a = new Absolute(inA,inK,inD,inC); //Make absolute from attributes
                addFunction(a); //Add it
                break;
            case "Sin":
                Sin s = new Sin(inA,inK,inD,inC); //Make sin from attributes
                addFunction(s); //Add it
                break;
            case "Cos":
                Cos c = new Cos(inA,inK,inD,inC); //Make cosine from attributes
                addFunction(c); //Add it
                break;
            case "Tan":
                Tan t = new Tan(inA, inK, inD, inC); //Make tan from attributes
                addFunction(t); //Add it
                break;
            case "Linear":
                Linear l = new Linear(inA,inK,inD,inC); //Make linear from attributes
                addFunction(l); //Add it
                break;
        }
    }
    
    public static void makePolynomial(double inA, double inK, double inD, double inC, double inE){ //Adding a function using a,k,d,c,e
        Polynomial p = new Polynomial(inA,inK,inD,inC,inE); //Create polynomial with given attributes
        addFunction(p); //Add it to the arraylist
    }
    
    public static void makeRational(Function numeratorIn, Function denominatorIn){ //Adding a rational function
        Rational r = new Rational(numeratorIn, denominatorIn); //Create with given functions
        addFunction(r); //Add it to the arraylist
    }
    
    public static void makeExponential(String type, double inA, double inK, double inD, double inC, double inB){
        //Type being Log or Exponential
        Function e;
        if(type.equals("Log")){
            e = new Logarithm(inA,inK,inD,inC,inB); //Create log with given attributes
        }else{
            e = new Exponential(inA,inK,inD,inC,inB); //Create exp. with given attributes
        }
        addFunction(e); //Add to ArrayList
    }
    
    public static void addFunction(Function f){ //Adds given function to arraylist
        functions.add(f); //Add to arrayList
    }
    
    public static void listFunctions(){ 
        for (Function function : functions) {
            System.out.println("Function: " + function.getClass());
            System.out.println("Function: " + function.propertiesStrings());
        }
    }
    
    public static void saveFuncs(){
        try {
            FileOutputStream file = new FileOutputStream(new File("functions.FG"));//Make the writer
            
            ObjectOutputStream stream = new ObjectOutputStream(file); //For writing object serial directly to file
            
            Object[] toWrite = functions.toArray(); //Convert functions to an array
            
            stream.writeObject((Object[]) toWrite); //Write the array to the file
            
        } catch (FileNotFoundException ex) {
            System.out.println("Missing functions.FG");
        } catch (IOException ex) {
            System.out.println("IO Exception while writing functions: " + ex.getMessage());
        }
    }
    
    public static void loadFuncs(){
        //Make the reader
        try {
            FileInputStream file = new FileInputStream("functions.FG");
            ObjectInputStream stream = new ObjectInputStream(file);
            
            
            functions.clear(); //Clear what is currently in functions
            
            Object[] funcs = (Object[]) stream.readObject(); //Read the array of objects from the file
            
            for (int i = 0; i < funcs.length; i++){ //Iterate thru funcs array
                functions.add((Function) funcs[i]); //Add to list
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Missing functions.FG");
        } catch (IOException ex) {
            System.out.println("IO Exception while writing functions: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found exception");
        }
        Gui.sidePanel.repaint();
    }
    
    //GETTER
    public static Function getFunction(int i){ //Get a function at a specific index
        return functions.get(i);
    }
    
    //SETTER
    public static void setFunction(int i, Function f){ //Set an index to a specific function
        functions.set(i, f);
    }
}
