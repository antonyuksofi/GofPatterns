package patterns.creational.abstractfactory.factories;

public interface AbstractToyFactory {
    CatToy getCatToy();

    DinosaurToy getDinosaurToy();

    RobotToy getRobotToy();
}
