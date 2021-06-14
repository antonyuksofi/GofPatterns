package patterns.creational.abstractfactory.fluffy;

import patterns.creational.abstractfactory.CatToy;

public class FluffyCatToy implements CatToy {
    @Override
    public String catSalute() {
        return this.getClass().getSimpleName();
    }
}
