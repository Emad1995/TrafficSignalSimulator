/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses.MightBeDeleted;

/**
 *
 * @author EMAD
 */
public class RedLight implements trafficLightsState {

    int time;
    public RedLight(int time) {
        this.time = time;
    }

    @Override
    public void redLight() {
    }

    @Override
    public void yellowLight() {
    }

    @Override
    public void greenLight() {
    }

    
}
