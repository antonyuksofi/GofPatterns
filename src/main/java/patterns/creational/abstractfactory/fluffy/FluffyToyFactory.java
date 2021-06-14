package patterns.creational.abstractfactory.fluffy;

import patterns.creational.abstractfactory.AbstractToyFactory;
import patterns.creational.abstractfactory.CatToy;
import patterns.creational.abstractfactory.DinosaurToy;
import patterns.creational.abstractfactory.RobotToy;

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
