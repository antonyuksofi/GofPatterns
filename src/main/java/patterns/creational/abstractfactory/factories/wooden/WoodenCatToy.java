package patterns.creational.abstractfactory.factories.wooden;

import patterns.creational.abstractfactory.factories.CatToy;

public class WoodenCatToy implements CatToy {
    @Override
    public String catSalute() {
        return this.getClass().getSimpleName();
    }
}
