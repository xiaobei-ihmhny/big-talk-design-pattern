package com.xiaobei.design_pattern.state_model;

/**
 * 主类
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero();
        hero.startRun();
        hero.setState(Hero.SPEED_UP);
        Thread.sleep(5000);
        hero.setState(Hero.SPEED_DOWN);
        Thread.sleep(5000);
        hero.setState(Hero.SWIM);
        Thread.sleep(5000);
        hero.stopRun();
    }
}
