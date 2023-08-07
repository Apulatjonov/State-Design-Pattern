package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/7/2023 17:02
 */
public class TurnedOff extends State{

    public TurnedOff(AirConditioner airConditioner) {
        super(airConditioner);
    }

    @Override
    public void clickPowerBtn() {
        System.out.println("Turned On!");
        airConditioner.changeState(new TurnedOn(airConditioner));
    }

    @Override
    public void clickHeatUp() {
        System.out.println("No use!");
    }

    @Override
    public void clickCoolDown() {
        System.out.println("No use!");
    }
}
