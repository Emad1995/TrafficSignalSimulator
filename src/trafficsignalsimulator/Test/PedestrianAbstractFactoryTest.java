/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.Test;

import trafficsignalsimulator.ProjectClasses.PedestrianFactories.FemalePedestrianFactory;
import trafficsignalsimulator.ProjectClasses.PedestrianFactories.MalePedestrianFactory;
import trafficsignalsimulator.ProjectClasses.Pedestrians.Pedestrian;
import trafficsignalsimulator.ProjectClasses.PedestrianFactories.PedestrianFactory;

/**
 *
 * @author EMAD
 */
public class PedestrianAbstractFactoryTest {
    
    
    public static void main(String []args)
    {
        
        PedestrianFactory MaleFactory;
        PedestrianFactory FemaleFactory;
        MaleFactory = new MalePedestrianFactory();
        FemaleFactory = new FemalePedestrianFactory();
        
        
        Pedestrian p1 = MaleFactory.createPedestrian("Old");
        Pedestrian p2 = MaleFactory.createPedestrian("Young");
        Pedestrian p3 = FemaleFactory.createPedestrian("Old");
        Pedestrian p4 = FemaleFactory.createPedestrian("Young");
        p1.cross();
        p2.cross();
        p3.cross();
        p4.cross();
    }
    
}
