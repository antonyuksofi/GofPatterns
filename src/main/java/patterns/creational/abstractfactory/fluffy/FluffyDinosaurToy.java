package patterns.creational.abstractfactory.fluffy;

import patterns.creational.abstractfactory.DinosaurToy;

public class FluffyDinosaurToy implements DinosaurToy {
    @Override
    public String dinoVoice() {
        return this.getClass().getSimpleName();
    }
}
