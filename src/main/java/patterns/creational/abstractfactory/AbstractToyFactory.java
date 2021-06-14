package patterns.creational.abstractfactory;

public interface AbstractToyFactory {
    CatToy getCatToy();

    DinosaurToy getDinosaurToy();

    RobotToy getRobotToy();
}
