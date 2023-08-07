package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/7/2023 16:53
 */

public abstract class State {
    protected AirConditioner airConditioner;

    public State(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    abstract public void clickPowerBtn();

    abstract public void clickHeatUp();

    abstract public void clickCoolDown();
}
