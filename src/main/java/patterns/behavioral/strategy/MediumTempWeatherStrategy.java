package patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class MediumTempWeatherStrategy implements ClothesSelectionStrategy {
    @Override
    public List<String> selectClothes() {
        List<String> clothes = new ArrayList<>(4);
        clothes.add("raincoat");
        clothes.add("blouse");
        clothes.add("trousers");
        clothes.add("shoes");
        return clothes;
    }
}
