/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses.Pedestrians;

/**
 *
 * @author EMAD
 */
public class YoungPedestrian extends Pedestrian {

    
    public String gender;
    public YoungPedestrian(String gender) {
        this.gender = gender;
    }


    Pedestrian createPedestrian(String pedestrianType) {
        Pedestrian  p = new YoungPedestrian(pedestrianType);
        return p;
    }

    @Override
    public void cross() {
            System.out.println("A Young " + gender + " crosses the road");
    }
    

}
