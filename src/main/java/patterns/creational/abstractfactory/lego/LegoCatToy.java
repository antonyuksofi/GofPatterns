package patterns.creational.abstractfactory.lego;

import patterns.creational.abstractfactory.CatToy;

public class LegoCatToy implements CatToy {
    @Override
    public String catSalute() {
        return this.getClass().getSimpleName();
    }
}
