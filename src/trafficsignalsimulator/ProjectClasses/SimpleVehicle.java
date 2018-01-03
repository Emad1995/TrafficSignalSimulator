/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses;

/**
 *
 * @author PHEECA
 */
public class SimpleVehicle extends Vehicle {

    String CarName;
    
    public SimpleVehicle(String Car)
    {
        CarName = Car;
    }
    @Override
    public String getDesc() {
        return CarName;
    }

}
