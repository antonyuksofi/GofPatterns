package patterns.creational.abstractfactory.lego;

import patterns.creational.abstractfactory.DinosaurToy;

public class LegoDinosaurToy implements DinosaurToy {
    @Override
    public String dinoVoice() {
        return this.getClass().getSimpleName();
    }
}
