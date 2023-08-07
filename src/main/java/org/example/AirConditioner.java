package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/7/2023 16:52
 */
public class AirConditioner {
    State state;
    Integer heatLvl;

    public AirConditioner() {
        this.state = new TurnedOff(this);
        this.heatLvl = 20;
    }

    public void changeState(State state){
        this.state = state;
    }

    public void clickPowerBtn(){
        this.state.clickPowerBtn();
    }

    public void clickHeatUp(){
        this.state.clickHeatUp();
    }

    public void clickCoolDown(){
        this.state.clickCoolDown();
    }
}
