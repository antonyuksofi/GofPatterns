package patterns.creational.abstractfactory.lego;

import patterns.creational.abstractfactory.AbstractToyFactory;
import patterns.creational.abstractfactory.CatToy;
import patterns.creational.abstractfactory.DinosaurToy;
import patterns.creational.abstractfactory.RobotToy;

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
