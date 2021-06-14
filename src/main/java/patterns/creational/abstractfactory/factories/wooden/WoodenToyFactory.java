package patterns.creational.abstractfactory.factories.wooden;

import patterns.creational.abstractfactory.factories.AbstractToyFactory;
import patterns.creational.abstractfactory.factories.CatToy;
import patterns.creational.abstractfactory.factories.DinosaurToy;
import patterns.creational.abstractfactory.factories.RobotToy;

public class WoodenToyFactory implements AbstractToyFactory {
    @Override
    public CatToy getCatToy() {
        return new WoodenCatToy();
    }

    @Override
    public DinosaurToy getDinosaurToy() {
        return new WoodenDinosaurToy();
    }

    @Override
    public RobotToy getRobotToy() {
        return new WoodenRobotToy();
    }
}
