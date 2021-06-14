package patterns.creational.abstractfactory.wooden;

import patterns.creational.abstractfactory.CatToy;

public class WoodenCatToy implements CatToy {
    @Override
    public String catSalute() {
        return this.getClass().getSimpleName();
    }
}
