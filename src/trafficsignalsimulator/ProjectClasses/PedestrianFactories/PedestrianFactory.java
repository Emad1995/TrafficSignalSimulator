/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses.PedestrianFactories;

import trafficsignalsimulator.ProjectClasses.Pedestrians.Pedestrian;

/**
 *
 * @author EMAD
 */
public abstract class PedestrianFactory {
    
    public abstract Pedestrian createPedestrian(String pedestrianType);
    
}
