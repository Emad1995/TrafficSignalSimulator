/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses;

import trafficsignalsimulator.ProjectClasses.ObserverInterfaces.IObserver;
import trafficsignalsimulator.ProjectClasses.Spoilers.ISpoiler;

/**
 *
 * @author PHEECA
 */
public abstract class Vehicle implements IObserver {
    
    public ISpoiler spoiler;
    public abstract String getDesc();
    
    @Override
    public void update()
    {
        
    }
    
  
}
