/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses.Pedestrians;

import trafficsignalsimulator.ProjectClasses.ObserverInterfaces.IObserver;

/**
 *
 * @author EMAD
 */
public abstract class Pedestrian implements IObserver{

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public abstract void cross();
}
