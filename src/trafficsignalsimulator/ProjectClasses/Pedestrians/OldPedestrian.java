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
public class OldPedestrian extends Pedestrian {

    public String gender;
    public OldPedestrian(String gender) {
        this.gender = gender;
    }


    Pedestrian createPedestrian(String pedestrianType) {
        Pedestrian  p = new OldPedestrian(pedestrianType);
        return p;
    }

    @Override
    public void cross() {
            System.out.println("An Old " + gender + " is helped crossing the road");
    }
    
}
