package patterns.creational.abstractfactory.factories.lego;

import patterns.creational.abstractfactory.factories.AbstractToyFactory;
import patterns.creational.abstractfactory.factories.CatToy;
import patterns.creational.abstractfactory.factories.DinosaurToy;
import patterns.creational.abstractfactory.factories.RobotToy;

public class LegoToyFactory implements AbstractToyFactory {
    @Override
    public CatToy getCatToy() {
        return new LegoCatToy();
    }

    @Override
    public DinosaurToy getDinosaurToy() {
        return new LegoDinosaurToy();
    }

    @Override
    public RobotToy getRobotToy() {
        return new LegoRobotToy();
    }
}
