package patterns.creational.abstractfactory.factories.fluffy;

import patterns.creational.abstractfactory.factories.AbstractToyFactory;
import patterns.creational.abstractfactory.factories.CatToy;
import patterns.creational.abstractfactory.factories.DinosaurToy;
import patterns.creational.abstractfactory.factories.RobotToy;

public class FluffyToyFactory implements AbstractToyFactory {
    @Override
    public CatToy getCatToy() {
        return new FluffyCatToy();
    }

    @Override
    public DinosaurToy getDinosaurToy() {
        return new FluffyDinosaurToy();
    }

    @Override
    public RobotToy getRobotToy() {
        return new FluffyRobotToy();
    }
}
