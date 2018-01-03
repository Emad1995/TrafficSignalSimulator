/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignalsimulator.ProjectClasses.Decorators;

import trafficsignalsimulator.ProjectClasses.Vehicle;


/**
 *
 * @author PHEECA
 */
public class VinylDecorator extends VehicleDecorator {

    private String sticker;
    private String stickerPosition;
    
    public VinylDecorator(Vehicle v, String sticker, String stickerPosition) {
        super(v);
        
        this.sticker = sticker;
        this.stickerPosition = stickerPosition;
        
    }

    @Override
    public String getDesc() {
        return decoratedVehicle.getDesc() + ", " + sticker + " on " + stickerPosition;
        
    }
}
