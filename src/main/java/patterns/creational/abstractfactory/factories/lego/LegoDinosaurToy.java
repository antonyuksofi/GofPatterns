package patterns.creational.abstractfactory.factories.lego;

import patterns.creational.abstractfactory.factories.DinosaurToy;

public class LegoDinosaurToy implements DinosaurToy {
    @Override
    public String dinoVoice() {
        return this.getClass().getSimpleName();
    }
}
