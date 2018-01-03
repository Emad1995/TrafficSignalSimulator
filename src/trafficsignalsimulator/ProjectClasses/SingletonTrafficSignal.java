/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses;

import trafficsignalsimulator.ProjectClasses.MightBeDeleted.RedLight;
import trafficsignalsimulator.ProjectClasses.MightBeDeleted.trafficLightsState;
import java.util.ArrayList;
import trafficsignalsimulator.ProjectClasses.ObserverInterfaces.ISubject;
import trafficsignalsimulator.ProjectClasses.ObserverInterfaces.IObserver;

/**
 *
 * @author EMAD
 */
public class SingletonTrafficSignal implements ISubject{

    
    private ArrayList<IObserver> observers = new ArrayList<>();
    private static SingletonTrafficSignal signal = null;
    
    trafficLightsState redLight;
    trafficLightsState yellowLight;
    trafficLightsState greenLight;
    
    String state;
    
    
    public static SingletonTrafficSignal getTrafficSignal()
    {
        if(signal == null)
        {
            signal = new SingletonTrafficSignal();
        }
        return signal;
    }

    private SingletonTrafficSignal() {
        //redLight = new RedLight(15);
        //yellowLight = new YellowLight(5);
        //greenLight = new GreenLight(15);
        
        state = "Red";
    }
//    
//    public void redLight()
//    {
//        state.redLight();
//    }
//
//    public void yellowLight()
//    {
//        state.yellowLight();
//    }
//
//    public void greenLight()
//    {
//        state.greenLight();
//    }
    
    
    @Override
    public void addObserver(IObserver obsvr) {
        observers.add(obsvr);
    }

    @Override
    public void removeObserver(IObserver obsvr) {
        observers.remove(obsvr);
    }

    @Override
    public void notifyObserver() {

        observers.forEach((obsvr) -> {
            obsvr.update();
        });
    }
//    void setState(trafficLightsState state)
//    {
//        this.state = state;
//    }
//    
//    trafficLightsState getRedLightState()
//    {
//        return redLight;
//    }
//    trafficLightsState getYellowLightState()
//    {
//        return yellowLight;
//    }
//    trafficLightsState getGreenLightState()
//    {
//        return greenLight;
//    }
}
