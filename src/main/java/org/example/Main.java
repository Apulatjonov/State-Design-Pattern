package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/7/2023 16:52
 */
public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.clickCoolDown();
        airConditioner.clickPowerBtn();
        airConditioner.clickCoolDown();
        airConditioner.clickCoolDown();
        airConditioner.clickHeatUp();
    }
}