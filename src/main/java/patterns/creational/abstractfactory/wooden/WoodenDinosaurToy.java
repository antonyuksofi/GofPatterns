package patterns.creational.abstractfactory.wooden;

import patterns.creational.abstractfactory.DinosaurToy;

public class WoodenDinosaurToy implements DinosaurToy {
    @Override
    public String dinoVoice() {
        return this.getClass().getSimpleName();
    }
}
