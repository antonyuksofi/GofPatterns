package patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ColdWeatherStrategy implements ClothesSelectionStrategy {
    @Override
    public List<String> selectClothes() {
        List<String> clothes = new ArrayList<>(4);
        clothes.add("coat");
        clothes.add("sweater");
        clothes.add("trousers");
        clothes.add("boots");
        return clothes;
    }
}
