package patterns.creational.abstractfactory.wooden;

import patterns.creational.abstractfactory.RobotToy;

public class WoodenRobotToy implements RobotToy {
    @Override
    public String robotGreeting() {
        return this.getClass().getSimpleName();
    }
}
