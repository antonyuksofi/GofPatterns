package patterns.behavioral.strategy;

import java.util.List;

public class Context {
    private int temperature;
    private boolean fallOuts;
    private ClothesSelectionStrategy strategy;

    Context(int temperature, boolean fallOuts) {
        this.temperature = temperature;
        this.fallOuts = fallOuts;

        if (temperature > 15) {
            strategy = new HotWeatherStrategy();
        } else if (temperature < 0) {
            strategy = new ColdWeatherStrategy();
        } else if (fallOuts) {
            strategy = new ColdWeatherStrategy();
        } else {
            strategy = new MediumTempWeatherStrategy();
        }
    }

    Context() {}

    public void setStrategy(ClothesSelectionStrategy strategy) {
        this.strategy = strategy;
    }

    public List<String> selectClothes() {
        return strategy.selectClothes();
    }
}
