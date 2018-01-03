/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses.Decorators;

import trafficsignalsimulator.ProjectClasses.Spoilers.ISpoiler;
import trafficsignalsimulator.ProjectClasses.Vehicle;

/**
 *
 * @author PHEECA
 */
public class SpoilerDecorator extends VehicleDecorator{

    public SpoilerDecorator(Vehicle v,ISpoiler s) {
        super(v);
        setSpoiler(s);
    }

        
    private void setSpoiler(ISpoiler spoiler)
    {
        this.spoiler = spoiler;
    }

    @Override
    public String getDesc()
    {
        return decoratedVehicle.getDesc() + " and has a " + spoiler.getSpoilerDesc() + " installed";
    }
}
