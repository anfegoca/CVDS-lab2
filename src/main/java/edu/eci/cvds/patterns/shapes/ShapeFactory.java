/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.patterns.shapes;

import static edu.eci.cvds.patterns.shapes.RegularShapeType.Hexagon;
import static edu.eci.cvds.patterns.shapes.RegularShapeType.Triangle;
import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;

/**
 *
 * @author andres.gonzalez-ca
 */
public class ShapeFactory {
    private static ShapeFactory fabrica;
    
    private ShapeFactory(){
        
    }
    public static ShapeFactory getFabrica(){
        if (fabrica == null){
            fabrica = new ShapeFactory();
        }else{
            System.out.println("JOHANN ES RE GURRERO");
        }
        return fabrica;
    }
    
    
    public Shape create(RegularShapeType type){
        Shape res=null;
        switch(type){
            case Triangle:
                res = new Triangle();
                break;
            case Hexagon:
                res = new Hexagon();
            break;
            case Pentagon:
                res = new Pentagon();
            break;
            case Quadrilateral:
                res = new Quadrilateral();
            break;
        }
        return res;
    }
}
