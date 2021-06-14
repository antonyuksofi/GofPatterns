package patterns.creational.abstractfactory.factories.lego;

import patterns.creational.abstractfactory.factories.CatToy;

public class LegoCatToy implements CatToy {
    @Override
    public String catSalute() {
        return this.getClass().getSimpleName();
    }
}
