package patterns.creational.abstractfactory.factories.wooden;

import patterns.creational.abstractfactory.factories.DinosaurToy;

public class WoodenDinosaurToy implements DinosaurToy {
    @Override
    public String dinoVoice() {
        return this.getClass().getSimpleName();
    }
}
