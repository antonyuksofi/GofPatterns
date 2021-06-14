package patterns.creational.abstractfactory.factories.fluffy;

import patterns.creational.abstractfactory.factories.RobotToy;

public class FluffyRobotToy implements RobotToy {
    @Override
    public String robotGreeting() {
        return this.getClass().getSimpleName();
    }
}
