/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.Test;

import trafficsignalsimulator.ProjectClasses.Decorators.ColorDecorator;
import trafficsignalsimulator.ProjectClasses.SimpleVehicle;
import trafficsignalsimulator.ProjectClasses.Spoilers.RearSpoiler;
import trafficsignalsimulator.ProjectClasses.Decorators.SpoilerDecorator;
import trafficsignalsimulator.ProjectClasses.Vehicle;
import trafficsignalsimulator.ProjectClasses.Decorators.VinylDecorator;

/**
 *
 * @author PHEECA
 */
public class VehicleDecoratorTest {
    
    public static void main(String []args)
    {
        Vehicle v;
        v = new VinylDecorator(new ColorDecorator(new SimpleVehicle("Mehran"),"Blue"),"Skull sticker","Bonnet");
        System.out.println(v.getDesc());
        
        v = new SpoilerDecorator(v,new RearSpoiler());
        System.out.println(v.getDesc());
    }
}
