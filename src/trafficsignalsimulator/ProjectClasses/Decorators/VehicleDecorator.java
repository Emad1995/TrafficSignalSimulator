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
public abstract class VehicleDecorator extends Vehicle {
    protected Vehicle decoratedVehicle;
    
    public VehicleDecorator(Vehicle v)
    {
        decoratedVehicle = v;
    }
}
