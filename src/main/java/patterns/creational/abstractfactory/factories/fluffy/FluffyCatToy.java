package patterns.creational.abstractfactory.factories.fluffy;

import patterns.creational.abstractfactory.factories.CatToy;

public class FluffyCatToy implements CatToy {
    @Override
    public String catSalute() {
        return this.getClass().getSimpleName();
    }
}
