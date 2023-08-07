package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/7/2023 17:00
 */
public class TurnedOn extends State{

    public TurnedOn(AirConditioner airConditioner) {
        super(airConditioner);
    }

    @Override
    public void clickPowerBtn() {
        System.out.println("Turned off!");
        airConditioner.changeState(new TurnedOff(airConditioner));
    }

    @Override
    public void clickHeatUp() {
        if (airConditioner.heatLvl < 36){
            airConditioner.heatLvl++;
            System.out.println("Current heat lvl: " + airConditioner.heatLvl);
        }else{
            System.out.println("On max lvl of heat: " + airConditioner.heatLvl);
        }
    }

    @Override
    public void clickCoolDown() {
        if (airConditioner.heatLvl > 15){
            airConditioner.heatLvl--;
            System.out.println("Current cool lvl: " + airConditioner.heatLvl);
        }else{
            System.out.println("On max lvl of cool: " + airConditioner.heatLvl);
        }
    }
}
