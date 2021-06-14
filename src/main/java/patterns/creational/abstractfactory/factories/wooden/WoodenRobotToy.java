package patterns.creational.abstractfactory.factories.wooden;

import patterns.creational.abstractfactory.factories.RobotToy;

public class WoodenRobotToy implements RobotToy {
    @Override
    public String robotGreeting() {
        return this.getClass().getSimpleName();
    }
}
