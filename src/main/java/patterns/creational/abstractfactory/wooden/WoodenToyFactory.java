package patterns.creational.abstractfactory.wooden;

import patterns.creational.abstractfactory.CatToy;
import patterns.creational.abstractfactory.DinosaurToy;
import patterns.creational.abstractfactory.RobotToy;
import patterns.creational.abstractfactory.AbstractToyFactory;

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
