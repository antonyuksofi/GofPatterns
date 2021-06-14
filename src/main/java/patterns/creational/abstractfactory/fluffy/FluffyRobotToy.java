package patterns.creational.abstractfactory.fluffy;

import patterns.creational.abstractfactory.RobotToy;

public class FluffyRobotToy implements RobotToy {
    @Override
    public String robotGreeting() {
        return this.getClass().getSimpleName();
    }
}
