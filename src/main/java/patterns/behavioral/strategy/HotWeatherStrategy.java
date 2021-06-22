package patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class HotWeatherStrategy implements ClothesSelectionStrategy {
    @Override
    public List<String> selectClothes() {
        List<String> clothes = new ArrayList<>(4);
        clothes.add("t-shirt");
        clothes.add("shorts");
        clothes.add("sunglasses");
        clothes.add("sandals");
        return clothes;
    }
}
