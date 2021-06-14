package patterns.creational.abstractfactory.factories.lego;

import patterns.creational.abstractfactory.factories.RobotToy;

public class LegoRobotToy implements RobotToy {
    @Override
    public String robotGreeting() {
        return this.getClass().getSimpleName();
    }
}
