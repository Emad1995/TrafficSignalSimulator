/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses.PedestrianFactories;

import trafficsignalsimulator.ProjectClasses.Pedestrians.OldPedestrian;
import trafficsignalsimulator.ProjectClasses.Pedestrians.Pedestrian;
import trafficsignalsimulator.ProjectClasses.Pedestrians.YoungPedestrian;

/**
 *
 * @author EMAD
 */
public class MalePedestrianFactory extends PedestrianFactory{

    
    @Override
    public Pedestrian createPedestrian(String pedestrianType) {
        String gender = "Man";
        switch(pedestrianType)
        {
            case "Old": return new OldPedestrian(gender);
            case "Young": return new YoungPedestrian(gender); 
        }
        return null;
    }    
    
    
}
