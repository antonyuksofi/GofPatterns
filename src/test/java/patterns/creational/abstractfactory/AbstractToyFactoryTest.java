package patterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;
import patterns.creational.abstractfactory.factories.AbstractToyFactory;
import patterns.creational.abstractfactory.factories.CatToy;
import patterns.creational.abstractfactory.factories.DinosaurToy;
import patterns.creational.abstractfactory.factories.RobotToy;
import patterns.creational.abstractfactory.factories.fluffy.FluffyCatToy;
import patterns.creational.abstractfactory.factories.fluffy.FluffyDinosaurToy;
import patterns.creational.abstractfactory.factories.fluffy.FluffyRobotToy;
import patterns.creational.abstractfactory.factories.fluffy.FluffyToyFactory;
import patterns.creational.abstractfactory.factories.lego.LegoCatToy;
import patterns.creational.abstractfactory.factories.lego.LegoDinosaurToy;
import patterns.creational.abstractfactory.factories.lego.LegoRobotToy;
import patterns.creational.abstractfactory.factories.lego.LegoToyFactory;
import patterns.creational.abstractfactory.factories.wooden.WoodenCatToy;
import patterns.creational.abstractfactory.factories.wooden.WoodenDinosaurToy;
import patterns.creational.abstractfactory.factories.wooden.WoodenRobotToy;
import patterns.creational.abstractfactory.factories.wooden.WoodenToyFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractToyFactoryTest {
    AbstractToyFactory factory;

    CatToy catToy;
    DinosaurToy dinosaurToy;
    RobotToy robotToy;


    @Test
    public void testFluffyToyFactory() {
        factory = new FluffyToyFactory();

        catToy = factory.getCatToy();
        dinosaurToy = factory.getDinosaurToy();
        robotToy = factory.getRobotToy();

        assertEquals(FluffyCatToy.class, catToy.getClass());
        assertEquals(FluffyDinosaurToy.class, dinosaurToy.getClass());
        assertEquals(FluffyRobotToy.class, robotToy.getClass());
    }

    @Test
    public void testLegoToyFactory() {
        factory = new LegoToyFactory();

        catToy = factory.getCatToy();
        dinosaurToy = factory.getDinosaurToy();
        robotToy = factory.getRobotToy();

        assertEquals(LegoCatToy.class, catToy.getClass());
        assertEquals(LegoDinosaurToy.class, dinosaurToy.getClass());
        assertEquals(LegoRobotToy.class, robotToy.getClass());
    }

    @Test
    public void testWoodenToyFactory() {
        factory = new WoodenToyFactory();

        catToy = factory.getCatToy();
        dinosaurToy = factory.getDinosaurToy();
        robotToy = factory.getRobotToy();

        assertEquals(WoodenCatToy.class, catToy.getClass());
        assertEquals(WoodenDinosaurToy.class, dinosaurToy.getClass());
        assertEquals(WoodenRobotToy.class, robotToy.getClass());
    }
}
