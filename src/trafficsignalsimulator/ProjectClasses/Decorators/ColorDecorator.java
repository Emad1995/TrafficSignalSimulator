/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses.Decorators;

import trafficsignalsimulator.ProjectClasses.Vehicle;

/**
 *
 * @author PHEECA
 */
public class ColorDecorator extends VehicleDecorator {

    String color;
    public ColorDecorator(Vehicle v,String color) {
        super(v);
        this.color = color;
    }
    
    @Override 
    public String getDesc()
    {
        return decoratedVehicle.getDesc() + " in " + color;
    }
}
