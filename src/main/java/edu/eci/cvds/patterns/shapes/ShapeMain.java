/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.patterns.shapes;

/**
 *
 * @author andres.gonzalez-ca
 */
public class ShapeMain {
    public static void main(String[] args) {
        if (args == null || args.length != 1) {
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }
        try {

            RegularShapeType type = RegularShapeType.valueOf(args[0]);
            
            Shape shape = ShapeFactory.getFabrica().create(type);
            
            System.out.println(String.format("Successfully created a %s with %s sides.", type, shape.getNumberOfEdges()));

        } catch (IllegalArgumentException ex) {
            System.err.println("Parameter '" + args[0] + "' is not a valid RegularShapeType");
            return;
        }
    }
}
