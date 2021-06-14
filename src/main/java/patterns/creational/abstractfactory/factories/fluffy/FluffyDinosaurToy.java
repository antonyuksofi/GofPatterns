package patterns.creational.abstractfactory.factories.fluffy;

import patterns.creational.abstractfactory.factories.DinosaurToy;

public class FluffyDinosaurToy implements DinosaurToy {
    @Override
    public String dinoVoice() {
        return this.getClass().getSimpleName();
    }
}
