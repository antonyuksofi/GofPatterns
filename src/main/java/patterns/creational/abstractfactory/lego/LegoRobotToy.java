package patterns.creational.abstractfactory.lego;

import patterns.creational.abstractfactory.RobotToy;

public class LegoRobotToy implements RobotToy {
    @Override
    public String robotGreeting() {
        return this.getClass().getSimpleName();
    }
}
